public class DancerExample {
    public static void main(String[] args) {
        System.out.println();
        // Valid dancer
        Dancer dancer1 = new Dancer("Navdeep", 24, 7);
        System.out.println(dancer1);
        // Dancer{name='Navdeep', age=24, skillLevel=7, numCostumes=0, numEvents=0}

        System.out.println();
        // Invalid name
        Dancer dancer2 = new Dancer("", 15, 3);
        // Output: Error: Dancer name cannot be null or empty
        // Output: Warning: Default values assigned for invalid inputs.
        System.out.println(dancer2);
        // Dancer{name='Unknown', age=15, skillLevel=3, numCostumes=0, numEvents=0}

        System.out.println();
        // Invalid age and invalid skill level
        Dancer dancer3 = new Dancer("Monty", -20, 15);
        // Output: Error: Age must be between 1 and 100
        // Output: Error: Skill level must be between 1 and 10
        // Output: Warning: Default values assigned for invalid inputs.
        System.out.println(dancer3);
        // Dancer{name='Monty', age=10, skillLevel=1, numCostumes=0, numEvents=0}

        System.out.println();
        // Add costumes
        Costume costume = new Costume("Purple Jumpsuit", "A full body purple spandex jumpsuit and no shoes.", 100, true);
        dancer1.addCostume(costume);
        System.out.println(dancer1);
        // Dancer{name='Navdeep', age=24, skillLevel=7, numCostumes=1, numEvents=0}

        System.out.println();
        Event event = new Event("Hip Hop Battle", 7, true);
        dancer1.registerForEvent(event);
        System.out.println(dancer1+"\n");
        // Dancer{name='Navdeep', age=24, skillLevel=7, numCostumes=1, numEvents=1} //////

        System.out.println("Skill adjust");
        // Adjust skill
        dancer1.adjustSkill(2);
        System.out.println(dancer1);
        // Dancer{name='Navdeep', age=24, skillLevel=9, numCostumes=1, numEvents=1}
        dancer1.adjustSkill(-1);
        System.out.println(dancer1+"\n");
        // Dancer{name='Navdeep', age=24, skillLevel=8, numCostumes=1, numEvents=1}

        System.out.println("Skill adjust with error");
        // Invalid skill adjustment
        dancer1.adjustSkill(-5);
        // Output: Error: Skill level cannot be adjusted more than 2 levels at a time.

    }
}
