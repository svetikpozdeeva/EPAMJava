package CollectionsMainTask;

public class Egg extends MilkProduct {
    public Egg(int weight){
        super("Яйцо", 99, 30, weight);
    }

    public void cook(){
        super.cook();
        System.out.println("Варим яички");
    }
}
