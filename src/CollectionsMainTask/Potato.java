package CollectionsMainTask;

public class Potato extends Vegetable{
    public Potato(int weight){
        super("Картофель", 83, weight);
    }

    public void cook(){
        super.cook();
        System.out.println("Варим картошечку");
    }
}
