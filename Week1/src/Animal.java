public class Animal {
    private String name;
    private int numLegs;

    public Animal(String name, int numLegs){
        this.name = name;
        this.numLegs = numLegs;
    }

    public String toString(){
        return String.format("Animal: name = %s, numLegs = %d.", name, numLegs);
    }

    public void sit(String name){
        System.out.println(name+" is sitting.");
    }



}
