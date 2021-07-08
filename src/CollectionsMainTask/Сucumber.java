package CollectionsMainTask;

public class Сucumber extends Vegetable{
    public Сucumber(int weight){
        super("Огурец", 15, weight);
    }

    public void cook(){
        super.cook();
        System.out.println("Нарезаем огурцы...");
    }
}
