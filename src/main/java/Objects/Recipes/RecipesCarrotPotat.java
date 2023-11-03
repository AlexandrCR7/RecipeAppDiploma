package Objects.Recipes;

public class RecipesCarrotPotat extends Recipes{

    final String recipe = "Способ приготовления: Отварить морковь и картоху 1 час. Блюдо готово.";

    public String getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return "" + recipe;
    }
}
