package CollectionsMainTask;

public class MilkProduct extends Product {
    public int shelfLife; // срок годности

    public MilkProduct(String name, int caloriesPerHundredGrams, int shelfLife, int weight) {
        super(name, caloriesPerHundredGrams, weight);
        this.shelfLife = shelfLife;
    }

    @Override
    public void cook(){
        System.out.println("Молоко для салата не надо готовить");
    }
}
