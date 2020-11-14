/**
 * TestRecipe class
 */
public class TestRecipe {
  // Point-of-entry to build Recipe class
  public static void main(String[] args) {
    // build basic recipe for rice
    Recipe rice = new Recipe.RecipeBuilder("Rice").addIngredient("Rice", "1 cup")
        .addIngredient("Water", "2 cups").addIngredient("Salt", "1 pinch").build();

    System.out.println("");

    // invoke recipe methods after ingredient is built
    rice.getRecipe();
    rice.getIngredients();
    rice.getQuantities();

    // print new line
    System.out.println("");

    // build recipe for oatmeal, but use update and delete functionality
    Recipe oatmeal = new Recipe.RecipeBuilder("Porridge").addIngredient("Oatmeal", "1/2 cup")
        .addIngredient("Water", "1/4 cup").deleteIngredient("Water")
        .addIngredient("Milk", "1/4 cup").updateTitle("Oatmeal")
        .addIngredient("Brown Sugar", "1 tablespoon").updateQuantity("Brown Sugar", "1 teaspoon")
        .build();

    // invoke recipe methods after ingredient is built
    oatmeal.getRecipe();
    oatmeal.getIngredients();
    oatmeal.getQuantities();

    // print new line
    System.out.println("");
  }
}
