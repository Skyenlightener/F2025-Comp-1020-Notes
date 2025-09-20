public class Recipe {

    private String name;
    private IngredientList ingredientList;

    public String getName() {
        return name;
    }

    public Recipe(String name, IngredientList ingredientList) {
        this.name = name;
        this.ingredientList = ingredientList;
    }

    public void addIngredient(Ingredient newIngredient) {
        String result = null;
        result = ingredientList.addIngredients(newIngredient);
        System.out.println(result);
    }

    public void removeIngredient(String nameIngredient) {
        String result = null;
        result = ingredientList.removeIngredients(nameIngredient);
        System.out.println(result);
    }

    public String toString() {
        System.out.println("Recipe: " + name + " :");
        int length = ingredientList.getLength();
        Ingredient[] recipeContent = ingredientList.getIngredients();
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                return "name = " + recipeContent[i].getName() + "; quantity = " + recipeContent[i].getQuantity() + " \n";
            }
            else{
                return "name = " + recipeContent[i].getName() + "; quantity = " + recipeContent[i].getQuantity();
            }
        }
        return "Above is all ingredients from "+ name;
    }
}
