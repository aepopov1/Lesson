import java.util.Arrays;
import java.util.Scanner;
/**
 * Вычислите результат выражения, используя рекурсивный алгоритм.
 * n — число, введенное с клавиатуры.
 * Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.
 * <p>
 * Выражение: √(1 + √(2 + ... + √n)))
 */
public class Lesson7_recursion_HW {
    //метод расчета фиббоначи. На вход подается количество циклов фиббоначчи
    //используется рекурсия

    public static void main(String[] args) {
        int x = 8;
        int y = rec(x);
        System.out.println(y); //вывод числа, который получился

        int z = 5;
        int m = factorial(z);
        System.out.println("Факториал \n"+m);

        Scanner console = new Scanner(System.in);
        System.out.println("введите число");
        int maxnumber  = console.nextInt();

        if (maxnumber < 1) {
            return;
        }
        else {
            System.out.println(sqr(1,maxnumber));
        }
        console.close();

    }
    // метод расчета числа фиббоначчи
    static int rec (int x){
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        else {
            return rec(x - 1) + rec(x - 2);
        }
    }
    //метод расчета факториала числа
    static int factorial (int a){
        int result = 0;
        if (a == 1)
            return 1;
        result = a*factorial(a-1);
        return result;
    }
    //метод подсчета  √(1 + √(2 + ... + √n)))
    static double sqr (int number, int maxnumber){
        double result = 0;
        if (number == maxnumber)
            return Math.sqrt(number);

        result = Math.sqrt(number + sqr(number+1,maxnumber));
        return result;
    }
}
