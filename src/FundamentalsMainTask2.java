import java.util.*;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class FundamentalsMainTask2 {
    public static void main(String[] args) {
        System.out.println("Введите любые символы через пробел");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        String[] arr2 = new String[arr.length];
        for (int i = arr.length-1; i > 0;) {
            for (int j = 0; j < arr.length; j++) {
                arr2[j] = arr[i];
                i--;
            }
        }
        String str2 = String.join(" ", arr2);
        System.out.println("Перевернутая строка = " + str2);
    }
}
