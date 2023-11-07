package Searcher;
import Servise.AllDishes;
import Servise.Dish;
import java.util.List;

public class Searcher implements SearcherInterface{
    @Override
    public void search(List<Dish> dishes, String viewer) {
        Integer count = 0;
        for (int i = 0; i < dishes.size(); i++) {
            if(dishes.get(i).toString().contains(viewer)){
                count += 1;
                if(count > 0)
                    System.out.println(dishes.get(i));
            }
        }
        if (count == 0){
            System.out.println("Ингридиент не найден.");
        }
    }
}
