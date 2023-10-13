import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //если значение отрицательное увеличить его в 2 раза,
        //если положительное, то увеличить на 10, если 0, то заменить на 100

        int x = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        x = scanner.nextInt();

        //условие ? выр1 : выр2
        x = x < 0 ? x * 2 : (x > 0 ? x + 10 : 100);

        System.out.println("x = " +x);

    }
}
