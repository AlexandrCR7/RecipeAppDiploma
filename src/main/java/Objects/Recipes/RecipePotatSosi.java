package Objects.Recipes;

public class RecipePotatSosi extends Recipes {

    final String recipe = "Пожарить сосиску 5 минут. Пожарить картошку 5 минут. Блюдо готово.";

    public String getRecipe() {
        return recipe;
    }

    @Override
    public String toString() {
        return "Способ приготовления: " + recipe;
    }
}
