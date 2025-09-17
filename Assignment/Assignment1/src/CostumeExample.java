public class CostumeExample {
    public static void main(String[] args) {
        System.out.println();
        // Valid Costume
        Costume costume1 = new Costume("Blue Dress", "A royal blue dress with a knee-length wavy skirt. Blue lyrical shoes. Blue hair accessory.", 75, false);
        System.out.println(costume1);
        // Costume{name='Blue Dress', description='A royal blue dress with a knee-length wavy skirt. Blue lyrical shoes. Blue hair accessory.', cost=$75.00, isSparkly=false}
        System.out.println(costume1.wearCostume());
        // You put on the Blue Dress. It's giving a modern and contemporary look that doesn't need all that razzle dazzle!
        System.out.println();

        // Invalid costume name
        Costume costume2 = new Costume("", "Not quite sure", 3.3267, true);
        // Output: Error: Costume name cannot be null or empty
        System.out.println(costume2);
        // Costume{name='Unknown', description='Note quite sure', cost=$3.33, isSparkly=true}
        System.out.println();

        // Invalid cost
        Costume costume3 = new Costume("Purple Jumpsuit", "A full body purple spandex jumpsuit and no shoes.", 0, true);
        // Output: Error: Cost must be above $0.00 and below $250.00
        System.out.println(costume3);
        // Costume{name='Purple Jumpsuit',, description='A full body purple spandex jumpsuit and no shoes.', cost=$1.00, isSparkly=true}
        System.out.println();

        // Both name and cost invalid
        Costume costume4 = new Costume(null, "", 300, false);
        // Output:
        // Error: Costume name cannot be null or empty
        // Error: Cost must be above $0.00 and below $250.00
        System.out.println(costume4); // Costume{name='Unknown', description='Indescribable', cost=$1.00, isSparkly=false}
        System.out.println();

        // Static method usage
        System.out.println("Total Costumes created: " + Costume.getTotalCostumes());
        // Output: Total Costumes created: 4

    }
}