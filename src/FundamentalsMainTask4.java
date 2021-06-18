import java.util.Scanner;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
public class FundamentalsMainTask4 {
    public static void main(String[] args) {
        System.out.println("Введите целые числа через пробел");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        int[] score = new int[arr.length];

        int sum = 0;
        int pr = 1;
        for(int i = 0; i < arr.length; i++){
            score[i] = Integer.parseInt(arr[i]);
            sum = sum + score[i];
            pr = pr * score[i];
        }

        System.out.println("Сумма чисел = " + sum);
        System.out.println("Произведение чисел = " + pr);
    }
}
