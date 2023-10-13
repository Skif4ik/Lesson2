import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int age = 0;
        double salary = 0.0;
        String name = null;
        //String - класс для использования строк
        //null - обозначение пустой ссылки, т.е. ссылка не указывает на объект
        //все переменные классов являются ссылками
        //для считывания из консоли необходимо создать обьект класса Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        age = scanner.nextInt();
        System.out.println("Введите зп");
        salary = scanner.nextDouble();
        System.out.println("Возраст: " + age + ", зп: " + salary);

        scanner.skip("\n");//после ввода числа перед вводом строки
        System.out.println("Введите имя");
        name = scanner.nextLine();//считывает с пробельными символами
        System.out.println("Имя: " +name);

    }
}
