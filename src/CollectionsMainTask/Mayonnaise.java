package CollectionsMainTask;

public class Mayonnaise extends MilkProduct {
    public Mayonnaise(int weight){
        super("Майонез", 680, 40, weight);
    }

    public void cook(){
        super.cook();
        System.out.println("Накладываем майонез");
    }
}
