package CollectionsMainTask;

public class Radish extends Vegetable {
    public Radish(int weight){
        super("Редис", 20, weight);
    }

    public void cook(){
        super.cook();
        System.out.println("Нарезаем редиски...");
    }
}
