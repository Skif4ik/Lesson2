import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //switch может работать с целыми числами, символами,
        //строками и перечислениями
        //switch не работает с вещественными значениями (float, double)

        //int num1 = 5;//здесь мог быть ввод пользователя, он ниже
        int num1 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        num1 = scanner.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Что-то не так");
                break;
        }

        System.out.println("========================================");


        int num2 = 0;
        //String day2 = "Вторник";//можно организовать ввод с клавиатуры

        String day2 = null;
        scanner.skip("\n");//после ввода числа перед вводом строки
        System.out.println("Введите название дня");
        day2 = scanner.nextLine();

        switch (day2) {
            case "Понедельник":
                num2 = 1;
                break;
            case "Вторник":
                num2 = 2;
                break;
            case "Среда":
                num2 = 3;
                break;
            case "Четверг":
                num2 = 4;
                break;
            case "Пятница":
                num2 = 5;
                break;
            case "Суббота":
                num2 = 6;
                break;
            case "Воскресенье":
                num2 = 7;
                break;
            default:
                num2 = -1;
                break;
        }
        System.out.println("Номер дня : " + num2);

        System.out.println("========================================");
        //по названию дня выдать сообщение будний это или выходной

        String day3 = null;
        System.out.println("Введите название дня");
        day3 = scanner.nextLine();

        switch (day3) {
            case "Понедельник":
                System.out.println("Будний");
                break;
            case "Вторник":
                System.out.println("Будний");
                break;
            case "Среда":
                System.out.println("Будний");
                break;
            case "Четверг":
                System.out.println("Будний");
                break;
            case "Пятница":
                System.out.println("Будний");
                break;
            case "Суббота":
                System.out.println("Выходной");
                break;
            case "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("что-то не так");
                break;
        }

        System.out.println("=================================");

        String day4 = null;
        System.out.println("Введите название дня");
        day4 = scanner.nextLine();


        switch (day4) {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Будний");
                break;
            case "Суббота":
            case "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("что-то не так");
                break;
        }

        System.out.println("================================");

        switch (day4) {
            case "Понедельник", "Вторник", "Среда", "Четверг", "Пятница":
                System.out.println("Будний");
                break;
            case "Суббота", "Воскресенье":
                System.out.println("Выходной");
                break;
            default:
                System.out.println("что-то не так");
                break;
        }

        System.out.println("================================");
        //по названию дня получить его номер
        int num5 = 0;
        String day5 = "Суббота";
        num5 = switch (day5) {
            case "Понедельник" -> 1;
            case "Вторник" -> 2;
            case "Среда" -> 3;
            case "Четверг" -> 4;
            case "Пятница" -> 5;
            case "Суббота" -> 6;
            case "Воскресенье" -> 7;
            default -> {
                System.out.println("что-то не так");
                yield -1;
            }

        };
        System.out.println("Номер дня: "+num5);

    }
}
