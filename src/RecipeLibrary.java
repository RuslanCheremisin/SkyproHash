import java.util.HashSet;
import java.util.Set;

public class RecipeLibrary {
    private Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe)throws IllegalArgumentException{
        for (Recipe r: recipes
             ) {
            if (recipe.equals(r)) {
                throw new IllegalArgumentException("This recipe is already in the library!");
            }

        }if (recipe.getRecipeName()==null) {
            throw new IllegalArgumentException("Not enough data on the product!");
        } else {
            recipes.add(recipe);
        }


    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }
}
