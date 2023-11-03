package Servise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDishes {

    List<Dish> allDishes = new ArrayList<>();

    public List<Dish> menu(Dish... v){
        allDishes.addAll(Arrays.asList(v));
        return allDishes;
    }
}
