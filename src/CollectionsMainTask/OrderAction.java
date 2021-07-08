package CollectionsMainTask;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderAction {
    public void diapazonCalories(double caloriesFrom, double caloriesTo, ArrayList<Product> products) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getCaloriesPerHundredGrams() >= caloriesFrom &&
                    product.getCaloriesPerHundredGrams() <= caloriesTo &&
                    product instanceof Vegetable) {
                System.out.println(product.name + " " + product.caloriesPerHundredGrams + " калорий");
            } else {
                iterator.remove();
            }
        }
    }
}
