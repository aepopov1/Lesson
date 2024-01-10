//Ввод с консоли

import java.util.Scanner;

public class Lesson2_Scanner {
    public static void main(String[] args) {
        String name = "Sasha";
        float height = 80.5f;
        int x = 5;
        int y = 10;
 //       System.out.printf("Name = %s Height = %.2f\n",name,height);// .2 - 2 знака после запятой
 //       System.out.printf("x = %d",x);
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите число а:");
        int a = in.nextInt();
        System.out.printf("Введите число b:");
        int b = in.nextInt();

        float c;
        c = (float)b*a*(a+b)/(a*a);
        System.out.printf("Число С %.2f ",c);
        int a3 = a*a*a;
        int b2 = b*b;
        boolean c1 = a3 > b2;
        System.out.println(c1);

        in.close();
/*

        System.out.printf(" Введите имя ");
        String name1 = in.nextLine();
        System.out.printf(" Введите возраст ");
        int age = in.nextInt();
        System.out.printf("Введите вес ");
        float height1 = in.nextFloat();
        System.out.printf("Name = %s age = %d height = %.2f \n",name1,age,height1);

 */

/* альтернативный вариант. Рассмотреть. Пишут, что Scanner глючный

public class Program {

    public static void main(String[] args) {

        System.out.print("Input name: ");
        String name = System.console().readLine();
        System.out.print("Input age: ");
        int age = Integer.parseInt(System.console().readLine());
        System.out.print("Input height: ");
        float height = Float.parseFloat(System.console().readLine());
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);

 */
    }
}
