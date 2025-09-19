public class DanceCompetitionExample {
    public static void main(String[] args) {
        DanceCompetition world = DanceCompetition.getInstance();

        // Add dancers
        Dancer dancer1 = new Dancer("Lily", 17, 5);
        Dancer dancer2 = new Dancer("Simran", 22, 9);
        Dancer dancer3 = new Dancer("Veronica", 30, 2);
        Dancer dancer4 = new Dancer("Victor", 32, 3);

        world.addDancer(dancer1);
        world.addDancer(dancer2);
        world.addDancer(dancer3);
        world.addDancer(dancer4);

        // Add costumes
        Costume costume1 = new Costume("Blue Dress", "A royal blue dress with a knee-length wavy skirt. Blue lyrical shoes. Blue hair accessory.", 75, false);
        Costume costume2 =  new Costume("Purple Jumpsuit", "A full body purple spandex jumpsuit and no shoes.", 125.25, true);
        world.addCostume(costume1);
        world.addCostume(costume2);

        // Add events
        Event event1 = new Event("West Coast Swing - Beginner", 1, false);
        Event event2 = new Event("Hip Hop Battle", 7, true);
        world.addEvent(event1);
        world.addEvent(event2);

        // Get dancers and events
        for (Dancer dancer : world.getDancers()) {
            System.out.println(dancer);
        }

        for (Event event : world.getEvents()) {
            System.out.println(event);
        }

        for (Costume costume : world.getCostumes()) {
            System.out.println(costume);
        }

        // Get a random event
        Event randomEvent = world.getRandomEvent();
        System.out.println("Random event: " + randomEvent);

        // Try adding beyond capacity
        for (int i = 0; i < 126; i++) {
            world.addDancer(new Dancer("ExtraDancer" + i, 100, 10));
        }
    }
}
