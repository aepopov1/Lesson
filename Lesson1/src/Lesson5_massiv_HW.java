import java.util.Arrays;
import java.util.Scanner;

public class Lesson5_massiv_HW {
    public static void main(String[] args) {
        //создать массив char. Положить в него побуквенно свое имя и вывести имя. Как с помощью String так и без него

        char[] name = new char[] {'С','а','ш','а'};
        for (char i: name){
            System.out.print(i);
        }
        String s = "";
        for (int i = 0; i < name.length; i++) {
            s+=name[i];
        }
        System.out.printf("\n%s",s);

        //заполнить массив значениями, введенными с клавиатуры

        Scanner number = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\nВведите число: ");
            arr[i] = number.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) sum = arr[i]+arr[arr.length-1];
            else sum = arr[i] + arr[i-1];

            System.out.printf("\nСумма %d",sum);
        }
        // Вычислить и записать в массив первые 10 простых чисел.
        // Вывести на экран сумму этих чисел

        int[] num = new int[10];
        int prnum  = 2;
        int ost = 0;
        int j;
        for (int i = 0; i < num.length; i++) {
            // значение 1 положим принудительно
            j = 2;
            //переписать и смотреть только делители из простых отобранных ранее чисел и убрать четные числа
            while (j <= prnum){
                ost = prnum%j;
                System.out.printf("\n pr = %d, ost = %d j = %d",prnum,ost,j); //для отладки
                if (ost > 0)  j++; //берем следующий делитель
                if (ost == 0 && j < prnum) {  // если нашли остаток от деления, но делитель меньше самого числа, то ищем следующее число
                    j = 2;
                    prnum++;
                }
                if (ost == 0 && j == prnum) { //нашли простое число. Записываем в массив, берем следующее число и выходим из цикла
                    num[i] = prnum;
                    prnum++;
                    break;
                }
            }
            System.out.printf("\n элемент массива %d значение = %d",i,num[i]);
        }
        int summa = 0 ;
        for (int i: num){
            summa +=i;
        }
        System.out.printf("\nСумма простых чисел %d ",summa);
    }
}
