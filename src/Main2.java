import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //если значение отрицательное увеличить его в 2 раза,
        //если положительное, то увеличить на 10, если 0, то заменить на 100

        int x = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        x = scanner.nextInt();

        if (x < 0) {
            x = x * 2;// или x *= 2
        }else if(x>0){
            x = x+10;// или x += 10
        }else{
            x = 100;
        }

        System.out.println("x = " +x);

        if(x<0){
            x=x*2;
        }else{
            //еще код
            if (x>0){
                x=x+10;
            }else{
                x=100;
            }
        }



    }
}
