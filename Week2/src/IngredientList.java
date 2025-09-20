import java.util.Objects;

public class IngredientList {

    private Ingredient[] ingredients;

    public IngredientList(){
        ingredients = new Ingredient[10];
    }

    public int getLength(){
        return ingredients.length;
    }

    public Ingredient getIngredient(int i){
        return ingredients[i];
    }

    public String addIngredients(Ingredient ingredient){
        if(ingredients != null || ingredients.length != 0){
            boolean findEmpty = false;
            for (int i = 0; i < ingredients.length && !findEmpty; i++) {
                if(ingredients[i] == null){
                    ingredients[i] = ingredient;
                    findEmpty = true;
                }
            }
            return ingredient.getName() + " has been added to the ingredient list.";
        } else{
            return "Cannot add anymore ingredients. The list is full.";
        }
    }

    public String removeIngredients(String ingredientName){
        boolean found = false;
        for (int i = 0; i < ingredients.length && !found; i++) {
            if(Objects.equals(ingredients[i].getName(), ingredientName)){
                ingredients[i] = null;
                found = true;
                return ingredientName+" has been removed from the list.";
                }
            }
        return "No match found.";
        }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}

