public class Guest {

    private String name;
    private String relationship;
    private String motivationalWords;
    private boolean allowedBackstage;
    private Dancer dancer;

    public Guest(String name, String relationship, boolean allowedBackstage, Dancer dancer){
        this.name = name;
        this.relationship = relationship;
        this.allowedBackstage = allowedBackstage;
        this.dancer = dancer;
        motivationalWords = giveMotivationalSpeech();

        boolean nameInvalid = (name == null || name.isEmpty());
        boolean relationshipInvalid = false;
        boolean dancerInvalid = dancer == null;

        if(nameInvalid){
            this.name = "Unknown";
            System.out.println("Error: Guest name cannot be null or empty");
        }

        if(relationship == null || relationship.isEmpty()){
            relationshipInvalid = true;
        }
        if((!relationship.equals("Family") && (!relationship.equals("Friend")) && (!relationship.equals("Choreographer")))){
            relationshipInvalid = true;
        }

        if(relationshipInvalid){
            this.relationship = "Unknown Relationship Type";
            motivationalWords = "my favourite dance is the macarena...";
            System.out.println("Error: Guest relationship should be Family, Friend, or Choreographer");
            this.allowedBackstage = false;
        }

        if(relationship.equals("Choreographer")){
            this.allowedBackstage = true;
        }else{
            this.allowedBackstage = false;
            System.out.println("Error: Only accredited choreographers are allowed allowed backstage");
        }

        if(dancerInvalid){
            System.out.println("Error: Guest must be associated with a valid dancer");
            Dancer newDancer = new Dancer("Default Dancer", 100,1);// skilllevel is not provided
        }

        if(nameInvalid || relationshipInvalid || dancerInvalid) {
            System.out.println("Warning: Default values assigned for invalid inputs.");
        }
    }

        public String getName(){
            return name;
        }

        public String getRelationship(){
            return relationship;
        }

        public boolean hasBackstageAccess(){
            return allowedBackstage;
        }

        public Dancer getDancer(){
            return dancer;
        }


        public String giveMotivationalSpeech(){
            if(relationship.equals("Family")){
                return "The Family says: we love you, honey!";
            }
            if(relationship.equals("Friend")){
                return "The Friend says: you got this!";
            }
            if(relationship.equals("Choreographer")){
                return "The Choreographer says: don't forget to point your toes!";
            }
            if(relationship.equals("Unknown Relationship Type")) {
                return name + "says: my favourite dance is the macarena...";
            }
            return null;
        }

        public String toString(){
            return String.format("Guest{name='%s', relationship='%s', allowedBackstage='%b', dancer='%s'}", name, relationship, allowedBackstage, "Default Dancer");
        }

}
