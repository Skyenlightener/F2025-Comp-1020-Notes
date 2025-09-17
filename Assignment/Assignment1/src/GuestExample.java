public class GuestExample {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Li", 31, 4);

        // Valid guest
        Guest guest1 = new Guest("Chris", "Choreographer", true, dancer);
        System.out.println(guest1);
        // Guest{name='Chris', relationship='Choreographer', allowedBackstage=true, dancer='Li'}
        System.out.println(guest1.giveMotivationalSpeech());
        // Output: The Choreographer says: don't forget to point your toes!"

        // Invalid name and access and invalid backstage access
        Guest guest2 = new Guest("", "Family", true, dancer);
        // Output: Error: Guest name cannot be null or empty
        // Output: Error: Only accreditated choreographers are allowed allowed backstage`
        // Output: Warning: Default values assigned for invalid inputs.
        System.out.println(guest2);
        // Guest{name='Unknown', relationship='Family', allowedBackstage=false, dancer='Li'}

        // Invalid relationship and invalid backstage access
        Guest guest3 = new Guest("Gabby", "", true, dancer);
        // Output: Error: Guest relationship should be Family, Friend, or Choreographer
        // Output: Error: Only accreditated choreographers are allowed allowed backstage`
        // Output: Warning: Default values assigned for invalid inputs.
        System.out.println(guest3);
        // Guest{name='Gabby', relationship='Unknown Relationship Type', allowedBackstage=false, dancer='Li'}
        System.out.println(guest3.giveMotivationalSpeech());
        // Output: Gabby says: my favourite dance is the macarena...

        // Null owner
        Guest guest4 = new Guest("Jessica", "Choreographer", true, null);
        // Output: Error: Guest must be associated with a valid Dancer
        // Output: Warning: Default values assigned for invalid inputs.
        System.out.println(guest4);
        // Guest{name='Jessica', relationship='Choreographer', allowedBackstage=true, dancer='Default Dancer'}
    }
}