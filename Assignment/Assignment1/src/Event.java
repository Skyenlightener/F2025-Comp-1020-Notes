import java.sql.SQLOutput;

public class Event {

    private String name;
    private int requiredSkillLevel;
    private boolean isAduleEvent;
    private Dancer[] competitors;
    private int numEntries;

    public Event(String name, int requiredSkillLevel, boolean isAduleEvent){
        this.name = name;
        this.requiredSkillLevel = requiredSkillLevel;
        this.isAduleEvent = isAduleEvent;

        if(name == null || name.isEmpty()){
            System.out.println("Error: Event name cannot be null or empty.");
            this.name = "Unknown Event";
        }
        if(requiredSkillLevel < 1 || requiredSkillLevel > 10){
            System.out.println("Error: RequiredSkillLevel must be between 1 and 10");
            this.requiredSkillLevel = 1;
        }

        competitors = new Dancer[25];
        numEntries = 0;
    }

    public String getName(){
        return name;
    }

    public int getRequiredSkillLevel(){
        return requiredSkillLevel;
    }

    public int getNumEntries(){
        return numEntries;
    }

    public boolean registerDancer(Dancer dancer){
        if(competitors[competitors.length - 1] == null){
            System.out.println("Error: Cannot register more dancers for the event. Event full.");
            return false;
        }
        if(dancer.getAge() < 18){
            System.out.println("Error: Cannot register dancer for the event. They do not meet entry criteria.");
            return false;
        }

        int indexToRegisterDancer = 0;
        for (int i = 0; i < competitors.length; i++) {
            if(competitors[i] == null){
                indexToRegisterDancer = i;
            }
        }
        competitors[indexToRegisterDancer] = dancer;
        return true;
    }

    public boolean canCompete(Dancer dancer){
        return ((dancer.getSkillLevel() >= requiredSkillLevel) && (dancer.getAge() >= 18 || isAduleEvent ));
    }

    public Dancer selectWinner(){
        if(competitors[0] == null || competitors.length == 0){
            System.out.println("Error: There are no dancers registered in this event. There is no winner");
            return null;
        }
        int[] dancersValue = new int[competitors.length];
        for (int i = 0; i < competitors.length; i++) {
            dancersValue[i] = competitors[i].getNumCostumes() * competitors.length - competitors[i].getAge() + competitors[i].getSkillLevel() * 10;
        }
        int highestValue = 0;
        for (int i = 0; i < dancersValue.length-1; i++) {
            highestValue = dancersValue[i];
            if (highestValue < dancersValue[i+1]) highestValue = dancersValue[i+1];
        }
        System.out.printf("The winner of the %s event is %d-year-old %s", name, competitors[highestValue].getAge(), competitors[highestValue].getName());
        return competitors[highestValue];
    }

    public String toString(){
        return String.format("Event{name='%s', requiredSkillLevel=%d, isAdultEvent=%b, numEntries=%d}", name, requiredSkillLevel, isAduleEvent, numEntries);
    }
}
