public class Event {

    // check
    private String name;
    private int requiredSkillLevel;
    private boolean isAdultEvent;
    private Dancer[] competitors;
    private int numEntries;

    public Event(String name, int requiredSkillLevel, boolean isAdultEvent){
        // check
        this.name = name;
        this.requiredSkillLevel = requiredSkillLevel;
        this.isAdultEvent = isAdultEvent;

        // check
        if(name == null || name.isEmpty()){
            System.out.println("Error: Event name cannot be null or empty.");
            this.name = "Unknown Event";
        }

        // check
        if(requiredSkillLevel < 1 || requiredSkillLevel > 10){
            System.out.println("Error: RequiredSkillLevel must be between 1 and 10");
            this.requiredSkillLevel = 1;
        }

        // check
        competitors = new Dancer[25];
        numEntries = 0;
    }


    // check
    public String getName(){
        return name;
    }

    // check
    public int getRequiredSkillLevel(){
        return requiredSkillLevel;
    }

    // check
    public int getNumEntries(){
        return numEntries;
    }

    public int findEmptySpot(){ // this method only serves for registering valid dancer in a event
        int indexForEmptySpot = 0;
        boolean findIndex = false;
        for (int i = 0; (i < competitors.length && !findIndex); i++) {
            if(competitors[i] == null){
                indexForEmptySpot = i;
                findIndex = true;
            }
        }
        return indexForEmptySpot;
    }

    // checking
    public boolean registerDancer(Dancer dancer){
        if(numEntries == competitors.length){ // use numEntries to judge whether the array is full or not
            System.out.println("Error: Cannot register more dancers for the event. Event full.");
            return false;
        }
        if(isAdultEvent && dancer.getAge()<18){
            System.out.println("Error: Cannot register dancer for the event. Their age do not meet entry criteria.");
            return false;
        }

        if(dancer.getSkillLevel() < requiredSkillLevel){
            System.out.println("Error: Cannot register dancer for the event. Their skill-level do not meet entry criteria.");
            return false;
        }

        int indexToRegisterDancer = findEmptySpot();
        competitors[indexToRegisterDancer] = dancer;
        numEntries++;
        return true;
    }


    // check
    public boolean canCompete(Dancer dancer){
        return ((dancer.getSkillLevel() >= requiredSkillLevel) && (dancer.getAge() >= 18 || isAdultEvent ));
    }

    // check
    public Dancer selectWinner(){
        if(competitors[0] == null){
            System.out.println("Error: There are no dancers registered in this event. There is no winner");
            return null;
        }

        int[] dancersValue = new int[numEntries];
        for (int i = 0; i < numEntries; i++) {
            dancersValue[i] = competitors[i].getNumCostumes() * numEntries - competitors[i].getAge() + competitors[i].getSkillLevel() * 10;
        }

        int highestValue = 0;
        int winner = 0;
        for (int i = numEntries-1; i > 0; i--) {
            winner = i;
            highestValue = dancersValue[i];
            if (highestValue < dancersValue[i-1]) {
                highestValue = dancersValue[i-1];
                winner = i - 1;
            }
        }


        System.out.printf("The winner of the %s event is %d-year-old %s", name, competitors[winner].getAge(), competitors[winner].getName());
        return competitors[winner];
    }

    // check
    public String toString(){
        return String.format("Event{name='%s', requiredSkillLevel=%d, isAdultEvent=%b, numEntries=%d}", name, requiredSkillLevel, isAdultEvent, numEntries);
    }
}
