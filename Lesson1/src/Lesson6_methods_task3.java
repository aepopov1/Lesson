import java.util.Scanner;
/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */
public class Lesson6_methods_task3 {
    
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника");
        int a = num.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int b = num.nextInt();

        //метод вывода на экран прямоугольника
        drow(a,b);

        // закрытие сканнера
        num.close();
    }

    static void drow (int y,int x){
        String res = "";
        for (int i = 1; i <= x; i++){
            for (int j = 1; j <= y; j++){
                if ((i == 1 || i == x) && (j == 1 || j == y)) res += "^";
                if ((i == 1 || i == x) && j > 1 && j < y)     res += "-";
                if ( i > 1 && i < x && (j == 1 || j == y))    res += "|";
                if (i > 1 && i < x && j > 1 && j < y)         res += " ";
            }
            System.out.printf(" %s \n",res);
            res = "";
        }

        return;
    }
}
