import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение(возможные операции - сложение, вычитание, умножение,деление): ");
        System.out.println("Пример выражения: 5,5 + 6,6");
        float answer = in.nextFloat();
        while (true) {
            char operation = in.next().charAt(0);
            float num2 = in.nextFloat();
            switch (operation) {
                case ('+'):
                    answer = plus(answer,num2);
                    break;
                case ('-'):
                    answer = minus(answer,num2);
                    break;
                case ('*'):
                    answer = multiplication(answer,num2);
                    break;
                case ('/'):
                    answer = division(answer,num2);
                    break;
                default: {
                    System.out.println("Ошибка записи выражения");
                    continue;
                }
            }
            if (Math.round(answer) == answer) System.out.print((int) answer);
            else System.out.print(answer);
        }

    }

    public static float plus(float num1, float num2) {
        return num1 + num2;
    }

    public static float minus(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiplication(float num1, float num2) {
        return num1 * num2;
    }

    public static float division(float num1, float num2) {
            return num1 / num2;
        }
    }
