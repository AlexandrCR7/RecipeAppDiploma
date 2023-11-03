package Servise;

import Objects.Products.Products;
import Objects.Recipes.Recipes;

import java.util.ArrayList;
import java.util.List;

public class DishCarrotPlusPotat extends Dish {
    List<String> products = new ArrayList<>();

    public List<String> ingredient(Recipes recipes, Products... v) {
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

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

}
