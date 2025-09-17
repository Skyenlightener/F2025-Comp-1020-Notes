import java.sql.SQLOutput;

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


        boolean nameInvalid = name == null || name.isEmpty();
        if(nameInvalid){
            name = "Unknown";
            System.out.println("Error: Guest name cannot be null or empty");
        }

        boolean relationshipInvalid = false;
        if(relationship == null || relationship.isEmpty()){
            relationshipInvalid = true;
        }
        if((!relationship.equals("Family") && (!relationship.equals("Friend")) && (!relationship.equals("Choreographer")))){
            relationshipInvalid = true;
        }

        if(relationshipInvalid){
            relationship = "Unknown Relationship Type";
            motivationalWords = "my favourite dance is the macarena...";
            System.out.println("Error: Guest relationship should be Family, Friend, or Choreographer");
            allowedBackstage = false;
        }

        if(relationship.equals("Choreographer")){
            allowedBackstage = true;
        }else if(relationship.equals("Friend") || relationship.equals("Family")){
            allowedBackstage = false;
            System.out.println("Error: Only accredited choreographers are allowed allowed backstage");
        }

        boolean dancerInvalid = dancer == null;
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
            if(motivationalWords.equals("Family")){
                return "The Family says: we love you, honey!";
            }
            if(motivationalWords.equals("Friend")){
                return "The Friend says: you got this!";
            }
            if(motivationalWords.equals("Choreographer")){
                return "The Choreographer says: don't forget to point your toes!";
            }
            if(motivationalWords.equals("Unknown Relationshhip Type")) {
                return name + "says: my favourite dance is the macarena...";
            }
            return null;
        }

        public String toString(){
            return String.format("Guest{name='%s', relationship='%s', allowedBackstage='%b', dancer='%s'}", name, relationship, allowedBackstage, dancer.getName());
        }

}
