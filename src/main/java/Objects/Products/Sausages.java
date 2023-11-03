package Objects.Products;

public class Sausages extends Products {
    final String name = "Сосиска";
    final Integer calories100gr = 127;
    final String typeOfCooking1 = "Жарка";
    final String typeOfCooking2 = "Тушение";

    public String getName() {
        return name;
    }

    public Integer getCalories100gr() {
        return calories100gr;
    }

    public String getTypeOfCooking1() {
        return typeOfCooking1;
    }


    public String getTypeOfCooking2() {
        return typeOfCooking2;
    }


    @Override
    public String toString() {
        return "Продукт: " + name + "\n" +
                "Калорий на 100гр: " + calories100gr + "\n" +
                "Способ приготовления №1: " + typeOfCooking1 + "\n" +
                "Способ приготовления №2: " + typeOfCooking2 + "\n";
    }
}
