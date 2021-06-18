import java.util.Scanner;

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class FundamentalsMainTask3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для вывода");
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        System.out.println("С переходом на новую строку");
        for (int i=1; i <= num; i++) {
            System.out.println((int)(Math.random()*100));
        }
        System.out.println("Без перехода на новую строку");
        for (int i=1; i <= num; i++) {
            System.out.print((int)(Math.random()*100) + " ");
        }
    }
}
