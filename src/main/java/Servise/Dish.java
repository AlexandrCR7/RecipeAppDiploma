package Servise;

import Objects.Products.Products;

import java.util.List;

public class Dish {
    public List<Products> ingredient(Products... v) {
        return List.of(v);
    }

}
