import java.lang.Math;
public class DanceCompetition {

    private Dancer[] dancers;
    private int numDancers;
    private Costume[] costumes;
    private int numCostumes;
    private Event[] events;
    private int numEvents;

    private DanceCompetition(){}
    private static DanceCompetition instance = new DanceCompetition();
    public static DanceCompetition getInstance(){
        if(instance == null) {
            instance = new DanceCompetition();
        }
        return instance;
    }
    DanceCompetition competition = DanceCompetition.getInstance();


    public static DanceCompetition resetCompetition() {
        DanceCompetition.instance = new DanceCompetition();
        return DanceCompetition.instance;
    }

    public DanceCompetition(Dancer[] dancers, Costume[] costumes, Event[] events){
        this.dancers = new Dancer[125];
        numDancers = 0;
        this.costumes = new Costume[60];
        numCostumes = 0;
        this.events = new Event[25];
        numEvents = 0;
    }

    public boolean addDancer(Dancer dancer){
        if(dancers != null && dancers.length != 0){
            boolean findDancerEmptyIndex = false;
            for (int i = 0; i < dancers.length && !findDancerEmptyIndex; i++) {
                if(dancers[i] == null){
                    dancers[i] = dancer;
                    findDancerEmptyIndex = true;
                }
            }
            numDancers++;
            return true;
        } else {
            System.out.println("Error: Cannot add more dancers to the DanceCompetition.");
            return false;
        }
    }

    public boolean addCostume(Costume costume){
        if(costumes != null && costumes.length != 0){
            boolean findCostumeEmptyIndex = false;
            for (int i = 0; i < costumes.length && !findCostumeEmptyIndex; i++) {
                if(costumes[i] == null){
                    costumes[i] = costume;
                    findCostumeEmptyIndex = true;
                }
            }
            numCostumes++;
            return true;
        } else{
            System.out.println("Error: Cannot add more costumes to the DanceCompetition.");
            return false;
        }
    }

    public boolean addEvent(Event event){
        if(events != null && events.length != 0){
            boolean findEventEmptyIndex = false;
            for (int i = 0; i < events.length && !findEventEmptyIndex; i++) {
                if(events[i] == null){
                    events[i] = event;
                    findEventEmptyIndex = true;
                }
            }
            numEvents++;
            return true;
        } else{
            System.out.println("Error: Cannot add more events to the DanceCompetition.");
            return false;
        }
    }

    public Event getRandomEvent() {
        if (events != null && events.length != 0) {
            System.out.println("Error: No events available in the DanceCompetition.");
            return null;
        }
        int registeredEvents = 0;
        boolean findRandomEventIndex = false;
        for (int i = 0; i < events.length && findRandomEventIndex; i++) {
            if(events[i] == null) {
                registeredEvents = i;
                findRandomEventIndex = true;
            }
        }
        return events[(int)(Math.random()*(registeredEvents+1))];
    }

    public Dancer[] getDancers(){
        Dancer[] copyDancers = new Dancer[numDancers];
        for (int i = 0; i < copyDancers.length; i++) {
            copyDancers[i] = dancers[i];
        }
        return copyDancers;
    }

    public Event[] getEvents(){
        Event[] copyEvents = new Event[numEvents];
        for (int i = 0; i < copyEvents.length; i++) {
            copyEvents[i] = events[i];
        }
        return copyEvents;
    }

    public Costume[] getCostumes(){
        Costume[] copyCostumes = new Costume[numCostumes];
        for (int i = 0; i < copyCostumes.length; i++) {
            copyCostumes[i] = costumes[i];
        }
        return copyCostumes;
    }
}
