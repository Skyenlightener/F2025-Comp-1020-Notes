public class EventExample {
    public static void main(String[] args) {

        System.out.println();
        // Valid event
        Event event = new Event("West Coast Swing Improv - Adult", 3, true);
        System.out.println(event);
        // Event{name='West Coast Swing Improv - Adult', requiredSkillLevel=3, isAdultEvent=true, numEntries=0}

        // Add required dancers
        Dancer dancer1 = new Dancer("Lily", 17, 5);
        Dancer dancer2 = new Dancer("Simran", 22, 9);
        Dancer dancer3 = new Dancer("Veronica", 30, 2);
        Dancer dancer4 = new Dancer("Victor", 32, 3);

        event.registerDancer(dancer1);

        // There should not be a winner yet
        event.selectWinner();

        event.registerDancer(dancer2);
        event.registerDancer(dancer3);
        event.registerDancer(dancer4);

        // There should be two dancers registered
        System.out.println("There are " + event.getNumEntries() + " dancers in the " + event.getName() + " event.");

        // Check for a winner
        event.selectWinner();
    }
}
