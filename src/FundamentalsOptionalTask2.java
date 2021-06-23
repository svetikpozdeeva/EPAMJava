import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Задание. Ввести с консоли n - размерность матрицы a [n] [n].
Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).

Выполнен пункт 1
1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

3.     Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки

4.     Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие*/
public class FundamentalsOptionalTask2 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] array = new int[n][n];
        //int[][] arr = new int[n-1][n-1];

        System.out.println("Введите число M, которое будет интеревалом случайных чисел от -M до M");
        Scanner scan1 = new Scanner(System.in);
        int m = scan1.nextInt();
        int max = -m;
        int min = m;
        int maxi =0;
        int maxj =0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(m - (-m)) + (-m);
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxi = i;
                    maxj = j;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Полученный массив");
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maxi != i) {
                    System.arraycopy(array, i, arr, i, 1);
                }
            }
        }
        System.out.println("Строка" + maxi + "Столбец" + maxj);
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);*/

        // сортируем строки двумерного массива,
        Arrays.stream(array).forEach(Arrays::sort);
        System.out.println("Отсортированный массив, строки матрицы в порядке возрастания значений элементов k-го столбца");
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        System.out.println("Максимальный элемент массива = " + max);
    }
}
