import java.lang.Math;
public class DanceCompetition {

    private Dancer[] dancers;
    private int numDancers;
    private Costume[] costumes;
    private int numCostumes;
    private Event[] events;
    private int numEvents;

    private static DanceCompetition instance = new DanceCompetition();

    private DanceCompetition(){

    }

    public static DanceCompetition getInstance() {
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

    private DanceCompetition(Dancer[] dancers, Costume[] costumes, Event[] events){
        dancers = new Dancer[125];
        numDancers = 0;
        costumes = new Costume[60];
        numCostumes = 0;
        events = new Event[25];
        numEvents = 0;
    }

    private boolean addDancer(Dancer dancer){
        if(dancers != null && dancers.length != 0){
            for (int i = 0; i < dancers.length; i++) {
                if(dancers[i] == null){
                    dancers[i] = dancer;
                }
            }
            return true;
        } else {
            System.out.println("Error: Cannot add more dancers to the DanceCompetition.");
            return false;
        }
    }

    private boolean addCostume(Costume costume){
        if(costumes != null && costumes.length != 0){
            for (int i = 0; i < costumes.length; i++) {
                if(costumes[i] == null){
                    costumes[i] == costume;
                }
            }
            return true;
        } else{
            System.out.println("Error: Cannot add more costumes to the DanceCompetition.");
            return false;
        }
    }

    public boolean addEvent(Event event){
        if(events != null && events.length != 0){
            for (int i = 0; i < events.length; i++) {
                if(events[i] == null){
                    events[i] == event;
                }
            }
            return true;
        } else{
            System.out.println("Error: Cannot add more events to the DanceCompetition.");
            return false;
        }
    }

    public Event getRandomEvent() {
        if (events != null && events.length != 0) {
            return null;
        }
        int registeredEvents = 0;
        for (int i = 0; i < events.length; i++) {
            if(events[i] == null) registeredEvents = i;
        }
        return events[(int)Math.random()*(registeredEvents+1)];
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
