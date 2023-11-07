package Servise;

import Objects.Products.Products;

import java.util.List;

public abstract class Dish {
    public List<Products> ingredient(Products... v) {
        return List.of(v);
    }

}
