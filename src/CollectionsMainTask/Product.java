package CollectionsMainTask;

public abstract class Product {
    protected String name;
    protected int caloriesPerHundredGrams;
    protected int weight;

    public Product(String name, int caloriesPerHundredGrams, int weight){
        this.name = name;
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesPerHundredGrams() {
        return caloriesPerHundredGrams;
    }

    public void setCaloriesPerHundredGrams(int caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void cook();

}
