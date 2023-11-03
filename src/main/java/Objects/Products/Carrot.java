package Objects.Products;

public class Carrot extends Products {

    final String name = "Морковка";
    final Integer calories100gr = 41;
    private String typeOfCooking1 = "Жарка";
    private String typeOfCooking2 = "Варка";

    @Override
    public String toString() {
        return "Продукт: " + name + "\n" +
                "Калорий на 100гр: " + calories100gr + "\n" +
                "Способ приготовления №1: " + typeOfCooking1 + "\n" +
                "Способ приготовления №2: " + typeOfCooking2 + "\n";
    }
}
