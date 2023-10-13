import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {


        int[] arr1 = null;
        int size = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива");
        size = scanner.nextInt();

        arr1 = new int[size];//выделили память для массива, как только 
        //пользователь определился с кол-вом элементов

        //arr1.length - public final поле, общее кол-во элементов в массиве
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Заполнение массива новыми значениями");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("введите " + (i + 1) + " элемент массива");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Заполненный массив");
        //Arrays - дополнительный класс, содержащий
        //кучу полезных статических (static) методов
        //Arrays.toString(arr1); превращает массив в его строковое представление
        System.out.println(Arrays.toString(arr1));


    }
}
