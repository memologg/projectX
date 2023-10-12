import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float num1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float num2 = in.nextFloat();
        System.out.print("Введите операцию (например +, -, *, /): ");
        char operation = in.next().charAt(0);
        System.out.print("Результат выражения: ");
        switch (operation) {
            case ('+'):
                System.out.println(plus(num1, num2));
                break;
            case ('-'):
                System.out.println(minus(num1,num2));
                break;
            case ('*'):
                System.out.println(multiplication(num1,num2));
                break;
            case ('/'):
                System.out.println(division(num1,num2));
                break;
            default:
                System.out.println("Ошибка в записи выражения");
        }

    }

    public static float plus (float num1, float num2) {
        return num1+num2;
    }
    public static float minus (float num1, float num2) {
        return num1-num2;
    }
    public static float multiplication (float num1, float num2) {
        return num1*num2;
    }
    public static float division (float num1, float num2) {
        return num1/num2;
    }

}
