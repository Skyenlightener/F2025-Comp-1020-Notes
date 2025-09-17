public class Dancer {

    private String name;
    private int age;
    private int skillLevel;
    private Costume[] closet;
    private Event[] events;
    private int numCostumes;
    private int numEvents;

    public Dancer(String name, int age, int skillLevel){
        this.name = name;
        this.age = age;
        this.skillLevel = skillLevel;

        boolean isNameInvalid = name == null || name.isEmpty();
        boolean isAgeInvalid = age < 10 || age > 100;
        boolean isSkillLevelInvalid = skillLevel < 1 || skillLevel > 10;
        if(isNameInvalid) {
            System.out.println("Error: Dancer name cannot be null or empty");
            this.name = "Unknown";
        }
        if (isAgeInvalid){
            System.out.println("Error: Age must be between 10 and 100");
            this.age = 10;
        }
        if (isSkillLevelInvalid){
            System.out.println("Error: Skill level must be between 1 and 10");
            this.skillLevel = 1;
        }

        if(isNameInvalid || isNameInvalid || isSkillLevelInvalid) System.out.println("Warning: Default values assigned for invalid inputs.");

        closet = new Costume[5];
        events = new Event[3];
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getNumCostumes(){
        return numCostumes;
    }

    public int getSkillLevel(){ //missing in guidance
        return skillLevel;
    }

    public boolean addCostume(Costume costume){
        if(closet[closet.length-1] != null){
            System.out.println("Error: Closet is full, cannot add more costumes.");
            return false;
        } else {
            int indexToAddDancer = 0;
            for (int i = 0; i < closet.length; i++) {
                if(closet[i] != null){
                    indexToAddDancer = i;
                }
            }
            closet[indexToAddDancer] = costume;
            numCostumes++;
            return true;
        }
    }

    public boolean registerForEvent(Event event){
        if(events[events.length-1] != null){
            System.out.println("Error: Dancer is already registered in the maximum allowed");
            return false;
        } else {
            int indexToRegisterEvent = 0;
            for (int i = 0; i < events.length; i++) {
                if(events[i] != null){
                    indexToRegisterEvent = i;
                }
            }
            events[indexToRegisterEvent] = event;
            numEvents++;
            return true;
        }
    }

    public void adjustSkill(int amount){
        if(amount > 2 || amount < -2){
            System.out.println("Error: Skill level cannot be adjusted more than 2 levels at a time.");
        } else {
            skillLevel += amount;
        }
        if (skillLevel < 1){
            skillLevel = 1;
        }
        if (skillLevel > 10){
            skillLevel = 10;
        }
    }

    public String toString(){
        return String.format("Dance{name='%s', age=%d, skillLevel=%d, numCostumes=%d, numEvents=%d}", name,age,skillLevel,numCostumes,numEvents);
    }
}
