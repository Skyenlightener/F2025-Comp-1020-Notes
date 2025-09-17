public class Costume {

    private String name;
    private String description;
    private double cost;
    private boolean isSparkly;
    private static int totalCostumes = 0;

    public Costume(String name, String description, double cost, boolean isSparkly){
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.isSparkly = isSparkly;

         if(name == null || name.isEmpty()){
            System.out.println("Error: Costume name cannot be null of empty");
            this.name = "Unknown";
        }
         if(cost <= 0.00 || cost >= 250.00){
            System.out.println("Error: Cost must be above $0.00 and below $250.00");
            this.cost = 1.0;
        }
        if(description == null || description.isEmpty()){
            this.description = "Indescribable";
        }
        totalCostumes++;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

    public boolean isSparkly(){
        return isSparkly;
    }

    public static int getTotalCostumes(){
        return totalCostumes;
    }

    public String wearCostume(){
        if(isSparkly){
            return "You put on the " + name + ". Be careful not to blind the judges with all those rhinestones!";
        } else{
            return "You put on the " + name + ". It's giving a modern and contemporary look that doesn't need all that razzle dazzle!";
        }
    }

    public String toString(){
        return String.format("Costume{name='%s', description='%s', cost$%.2f, isSparkly=%b}", name, description, cost, isSparkly);
    }

    public static void restTotalCostumes(){ // only for test purpose
        totalCostumes = 0;
    }

}
