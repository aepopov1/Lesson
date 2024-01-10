import java.util.Scanner;

public class Lesson4_Cycle_task1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        //Задача 1. Вывести факториал заданного с клавиатуры числа
        System.out.printf("Введите число: ");
        int i = number.nextInt();
        int result = 1;
        for (int j = 1;j<=i;j++){
            result *= j;
        }
        System.out.printf("число %d",result);

        //Задание 2. Вывести сумму цифр заданного  с клавиатуры числа
        System.out.printf("\n Введите число: ");
        int z = number.nextInt();
        result = 0 ;
        while (z >= 1){
            result += z%10;
            System.out.printf("%d",result);
            z /= 10;
        }
        System.out.printf("\n Число получилось %d",result);
        //Задать с клавиатуры длину и ширину прямоугольника. Нарисовать его

        System.out.printf("\n Введите длину прямоугольника: ");
        int y = number.nextInt();
        System.out.printf("\n Введите ширину прямоугольника: ");
        int x = number.nextInt();

        char r = '-';
        char t = '|';
        char u = '^';
        char o = ' ';
        String res = "";
        for (i = 1;i<=x;i++){
            for (int j= 1;j<=y;j++){
                if ((i == 1 || i == x) && (j == 1 || j == y)) res += u;
                if ((i == 1 || i == x) && j > 1 && j < y) res += r;
                if ( i > 1 && i < x && (j == 1 || j == y)) res += t;
                if (i > 1 && i < x && j > 1 && j < y) res += o;
             }
            System.out.printf(" %s \n",res);
            res = "";
        }

        //Задание. выводить на экран надпись до тех пор, пока не введут значение 1

        while (1==1){
            System.out.printf("\n Введите число: ");
            int l = number.nextInt();
            if (l == 1){
                System.out.printf("Верно");
                break;
            }
            else System.out.printf("не угадал. Попробуй еще раз");

        }
        number.close();

    }
}
