import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        //Math - класс содержащий полезные математические методы
        //Math.random() возвращает случайные вещественные числа от 0 до 1(не включая 1) [0;1)
        //0 до 0.999999999999999999999999999999999

        int min = 4, max = 20;
        int x = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(x);

        final int SIZE = 10;
        int[] arr1 = new int[SIZE];

        //заполнение массива из 10 элементов случайными числами от 4 до 20
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println("Новый массив");
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("===== Отсортированный массив =====");
        System.out.println(Arrays.toString(arr1));

        //увеличим массив на 5 элементов

        //.copyOf - создает копию массива
        //int[] arr2 = arr1; не получаем коптю массива а вторую ссылку на тот же массив
        //Arrays.copyOf(откуда_копировать, размер_нового_массива);
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);//что бы создать точную копию массива нужен метод .copyof
        System.out.println("Массив-копия");
        System.out.println(Arrays.toString(arr2));

        //Увеличить arr1 на 5 элементов
        arr1 = Arrays.copyOf(arr1, arr1.length + 5);
        System.out.println("Увеличенный массив");
        System.out.println(Arrays.toString(arr1));
    }
}
