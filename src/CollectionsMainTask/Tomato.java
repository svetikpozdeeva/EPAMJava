package CollectionsMainTask;

public class Tomato extends Vegetable {
    public Tomato(int weight){
        super("Помидор", 30, weight);
    }

    public void cook(){
        super.cook();
        System.out.println("Нарезаем помидорки...");
    }
}
