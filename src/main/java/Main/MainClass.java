package Main;

import Objects.Products.Carrot;
import Objects.Products.Potato;
import Objects.Products.Sausages;
import Objects.Recipes.RecipePotatSosi;
import Objects.Recipes.RecipesCarrotPotat;
import Searcher.Searcher;
import Servise.AllDishes;
import Servise.DishCarrotPlusPotat;
import Servise.DishPotatPlusSosi;
import View.Viewer;

public class MainClass {
    public static void main(String[] args) {

        // Products
        Potato potato = new Potato();
        Sausages sausages = new Sausages();
        Carrot carrot = new Carrot();

        // Recipes
        RecipesCarrotPotat recipesCarrotPotat = new RecipesCarrotPotat();
        RecipePotatSosi recipePotatSosi = new RecipePotatSosi();

        DishPotatPlusSosi dishPotatPlusSosi = new DishPotatPlusSosi();
        dishPotatPlusSosi.ingredient(recipePotatSosi, potato, sausages);

        DishCarrotPlusPotat dishCarrotPlusPotat = new DishCarrotPlusPotat();
        dishCarrotPlusPotat.ingredient(recipesCarrotPotat, carrot, potato);
        Viewer viewer = new Viewer();

        Searcher searcher = new Searcher();
        AllDishes allDishes = new AllDishes();

        searcher.search(allDishes.menu(dishCarrotPlusPotat, dishPotatPlusSosi), viewer.request());

    }
}
