package CollectionsMainTask;

public class Vegetable extends Product {

    private boolean isWashed;

    public Vegetable(String name, int caloriesPerHundredGrams, int weight){
        super(name, caloriesPerHundredGrams, weight);
    }

    @Override
    public void cook() {
        if(!isWashed){
            System.out.println("Не вымото!");
            return;
        }
    }

}
