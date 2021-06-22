import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

2.     Вывести числа в порядке возрастания (убывания) значений их длины.

3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.*/
public class FundamentalsOptionalTask1 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел");
        Scanner scan = new Scanner(System.in);
        try {
            String str = scan.nextLine();
            String[] arr = str.split(" ");
            int[] score = new int[arr.length];

            int lenx = 1;
            int leny = 0;
            int min = 0, max = 0;
            //находим самое длинное и самое короткое число
            for(int g = 0; g < arr.length; g++) {
                score[g] = Integer.parseInt(arr[g]);
                if (arr[g].length() <= lenx) {
                    min = Integer.parseInt(arr[g]);
                    lenx = arr[g].length();
                } else if (arr[g].length() >= leny) {
                    max = Integer.parseInt(arr[g]);
                    leny = arr[g].length();
                }
            }
            System.out.println("Самое длинное число: " + max + " Его длина = " + leny);
            System.out.println("Самое короткое число: " + min + " Его длина = " + lenx);

            //сортировка чисел по длине
            for(int i = arr.length-1; i > 0; i--) {
               for(int j = 0; j < i; j++) {
                    if( arr[j].length() > arr[j+1].length()){
                        String tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
            System.out.println("числа в порядке возрастания значений их длины: " + Arrays.toString(arr));
        } catch (Exception e) {
            System.out.println("Кажется, один из ваших аргументов не является числом");
        }
    }
}
