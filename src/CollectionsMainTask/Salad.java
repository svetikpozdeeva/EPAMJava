package CollectionsMainTask;

import java.util.ArrayList;
import java.util.Arrays;

//Шеф-повар. Определить иерархию овощей. Сделать салат.
// Подсчитать калорийность. Провести сортировку овощей для салата на основе одного из параметров.
// Найти овощи в салате, соответствующие заданному диапазону калорийности.
public class Salad {
    public static void main(String[] args) {

        Mayonnaise mayonnaise = new Mayonnaise(30);
        Egg egg = new Egg(120);
        Potato potato = new Potato(250);
        Radish radish = new Radish(150);
        Сucumber сucumber = new Сucumber(300);
        Tomato tomato = new Tomato( 300);
        ArrayList<Product> products = new ArrayList<>();
        products.add(mayonnaise);
        products.add(egg);
        products.add(potato);
        products.add(radish);
        products.add(сucumber);
        products.add(tomato);

        String formattedDouble = String.format("%.2f", 0.1321231);

        //Подсчет калорийности салата
        double caloriesOneProduct = 0;
        double caloriesSalad = 0;
        for (int i=0; i <= products.size()-1; i++) {
            caloriesOneProduct = Math.round((products.get(i).weight / 100.0) * products.get(i).caloriesPerHundredGrams);
            caloriesSalad = caloriesSalad + caloriesOneProduct;
            Product p = products.get(i);
        }
        System.out.println("Калорийность салата = " + caloriesSalad);

        //Сортировка списка по алфавиту названий ингридиентов
        System.out.println("Отсортированный список ингридиетов по имени");
        products.sort(new ProductNameComparator());
        for (int i = 0; i < products.size()-1; i++) {
            System.out.println(products.get(i).name);
        }

        //Вывод овощей в заданном диапазоне калорий
        double caloriesFrom = 20;
        double caloriesTo = 100;
        System.out.println("Овощи в диапазоне каллорийности от " + caloriesFrom + " до " + caloriesTo);
        OrderAction action = new OrderAction();
        action.diapazonCalories(caloriesFrom, caloriesTo, products);
    }
}
