
// import HashMap to store ingredients
import java.util.HashMap;

/**
 * Recipe class
 */
public class Recipe {
  // private final ingredients variable
  private final HashMap<String, String> ingredients;
  // private final title variable
  private final String title;

  /**
   * Recipe constructor
   *
   * @param builder A RecipeBuilder instance
   */
  private Recipe(RecipeBuilder builder) {
    ingredients = new HashMap<String, String>(builder.ingredients);
    title = builder.title;
  }

  /**
   * Print title and all ingredients with quantities
   */
  public void getRecipe() {
    System.out.println("\"" + this.title + "\"" + " recipe:");
    System.out.println(ingredients);
  }

  // Print title and all ingredients without quantities
  public void getIngredients() {
    System.out.println("\"" + this.title + "\"" + " ingredients:");
    System.out.println(ingredients.keySet());
  }

  // Print title and all quantities
  public void getQuantities() {
    System.out.println("\"" + this.title + "\"" + " quantities:");
    System.out.println(ingredients.values());
  }

  /**
   * RecipeBuilder static class
   */
  public static class RecipeBuilder {
    // private title variable
    private String title;
    // private ingredients variable
    private HashMap<String, String> ingredients = new HashMap<String, String>();

    /**
     * RecipeBuilder constructor
     *
     * @param title The name of the recipe
     */
    public RecipeBuilder(String title) {
      this.title = title;
    }

    /**
     * Updates recipe title
     *
     * @param title The new title
     * @return The current recipe being built
     */
    public RecipeBuilder updateTitle(String title) {
      this.title = title;
      return this;
    }

    /**
     * Adds a new ingredient with corresponding quantity
     *
     * @param ingredient The ingredient name
     * @param quantity   The ingredient quantity
     * @return The current recipe being built
     */
    public RecipeBuilder addIngredient(String ingredient, String quantity) {
      ingredients.put(ingredient, quantity);
      return this;
    }

    /**
     * Updates an ingredient's quantity
     *
     * @param ingredient  The ingredient to update
     * @param newQuantity The new quantity
     * @return The current recipe being built
     */
    public RecipeBuilder updateQuantity(String ingredient, String newQuantity) {
      ingredients.replace(ingredient, newQuantity);
      return this;
    }

    /**
     * Deletes an ingredient and quantity
     *
     * @param ingredient The ingredient to delete
     * @return The current recipe being built
     */
    public RecipeBuilder deleteIngredient(String ingredient) {
      ingredients.remove(ingredient);
      return this;
    }

    /**
     * The last method to invoke after the recipe is finalized
     *
     * @return An instance of the Recipe class
     */
    public Recipe build() {
      return new Recipe(this);
    }
  }
}
