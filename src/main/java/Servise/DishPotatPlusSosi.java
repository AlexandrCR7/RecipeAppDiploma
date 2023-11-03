package Servise;

import java.util.ArrayList;
import java.util.List;
import Objects.Products.Products;
import Objects.Recipes.Recipes;

public class DishPotatPlusSosi extends Dish{

    List<String> products = new ArrayList<>();

    public List<String> ingredient(Recipes recipes, Products...v) {
        for(int i = 0; i < v.length; i++) {
            products.add(v[i].toString());
        }
        products.add(recipes.toString());
        return products;
    }

    @Override
    public String toString() {
        return "" + products;
    }
}
