import java.util.Scanner;

//Приветствовать любого пользователя при вводе его имени через командную строку.
public class FundamentalsMainTask1 {
    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if (null != name) {
            System.out.println("Добрый день " + name + "!");
        } else {System.out.println("Введите свое имя");}
    }
}
