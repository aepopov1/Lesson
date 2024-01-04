import java.util.Scanner;

public class Lesson3_if_switch {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        if (a>b) {
            System.out.printf("number B %d",b);
        }
        else if (a==b){
            System.out.printf("Числа равны B %d",b);
        }
        else {
            System.out.printf("Все остальное B %d \n",b);
        }

        // если не ставить break то будут обрабатываться все остальные шаги без учета case
        // пример ниже: обработается b++ дважды
        switch (a){
            case 1:
                b--;
            case 10:
                b++;
            case 100:
                b++;
                break;
            default:
                b= 300;
                break;
        }
        System.out.printf("number B %d \n",b);

        //тернарная операция - операция с 3 параметрами
        //[первый операнд - условие] ? [второй операнд] : [третий операнд].
        //В зависимости от условия тернарная операция возвращает второй или третий операнд:
        //если условие равно true, то возвращается второй операнд; если условие равно false, то третий
        int x = 15;
        int y = 11;
        int z = (x<y) ? (x+y) : (y-x);
        System.out.printf("number z %d \n",z);

        //задание 1. Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
        // А программа сранивает два введенных числа и выводит на консоль результат сравнения (два числа равны,
        // первое число больше второго или первое число меньше второго)

        Scanner number = new Scanner(System.in);

        System.out.printf("Введите число:");
        int a1 = number.nextInt();
        System.out.printf("Введите второе число:");
        int a2 = number.nextInt();
        if (a1>a2) System.out.printf("Первое число %d больше второго %d",a1,a2);
        else if (a1==a2) System.out.printf("Первое число %d равно второму %d",a1,a2);
        else  System.out.printf("Первое число %d меньше второго %d",a1,a2);

        //задание 2.
        //Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
        // Если число одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10".
        // Иначе программа выводит сообщение "Неизвестное число".
        System.out.printf("задача 2: Введите число:");
        int a3 = number.nextInt();

        if (a3>2 && a3<9)  System.out.printf("Число больше 2 и меньше 9 %d \n",a3);
        else  System.out.printf("неизвестное число \n");

        //В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться. Напишите консольную программу,
        // в которую пользователь вводит сумму вклада. Если сумма вклада меньше 100, то начисляется 5%.
        // Если сумма вклада от 100 до 200, то начисляется 7%. Если сумма вклада больше 200, то начисляется 10%.
        // В конце программа должна выводить сумму вклада с начисленными процентами.

        float prc = 0f ;
        System.out.printf("задача 3: Введите сумму вклада:");
        int vklad = number.nextInt();
        if (vklad >= 100 && vklad <= 200){
             prc = ((float)vklad*7)/100;
             System.out.printf("Сумма вклада с процентами %.2f \n",vklad+prc);
        }
        else if (vklad > 200) {
            prc = vklad*10/100;
            System.out.printf("Сумма вклада с процентами %.2f \n",vklad+prc);
        }

        //Напишите консольную программу, которая выводит пользователю сообщение "Введите номер операции: 1.Сложение
        // 2.Вычитание 3.Умножение". Рядом с названием каждой операции указан ее номер, например, операция вычитания имеет номер
        // 2. Пусть пользователь вводит в программе номер операции, и в зависимости от этого номера программа выводит название операции.
        //Для определения операции по введенному номеру используйте конструкцию switch...case.
        //Если введенное пользователем число не соответствует никакой операции (например, число 120),
        // то выведите пользователю сообщение о том, что операция неопределена.

        System.out.printf("\n Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение ");
        int t = number.nextInt();

        System.out.printf("\n введите число 1");
        int s1 = number.nextInt();
        System.out.printf("\n Введите число 2");
        int s2 = number.nextInt();

        switch(t){
            case 1:
                System.out.printf("Операция сложения: %d",s1+s2);
                break;
            case 2:
                System.out.printf("Операция вычитания: %d",s1-s2);
                break;
            case 3:
                System.out.printf("Операция умножения: %d",s1*s2);
                break;
            default:
                System.out.printf("Операция не определена");
        }

        System.out.printf("\n Введите фамилию: ");
        String name = number.next();
        System.out.printf("Введите имя: ");
        String name1 = number.next();
        System.out.printf("Введите отчество: ");
        String name2 = number.next();
        System.out.printf("ФИО: %s %s %s",name,name1,name2);

        System.out.printf("\n введите число: ");
        int z1 = number.nextInt();
        System.out.printf("\n Введите число: ");
        int z2 = number.nextInt();

        long result = 0;

        if (z1%2 == 0 || z2%3 == 0) {
             result = (long)Math.pow(z1,z2);
             if (result < Integer.MAX_VALUE && result > Integer.MIN_VALUE) System.out.printf("Число: %d \n",result);
             else System.out.printf(" Превышен порог числа %d",result);
        }
        number.close();
    }
}
