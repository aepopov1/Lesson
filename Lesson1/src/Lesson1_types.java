//Lesson 7 . Математические функции

public class Lesson1_types {
    public static void main (String[] args){
       int a = 10;
       int b = 15;
       int c = a + b;

       float s = 10.0f;
       double d = s/b ; //если оба числа int то и результат будет окгруглен вне зависимости от присваиваемой переменной.
                        // Чтобы был верный результат, один из операторов должен быть float

       int z = b % a ; // остаток от деления

       int q = ++a ; //перфиксное увеличение. Сначала увеличение переменной а на 1 и потом присвоение
       int w = a++ ; //постфиксное увеличение. Сначала присвоение переменной w = a а после увеличение переменной а на 1
       System.out.printf("C = %d d = %.2f z = %d \n",c,d,z );
       System.out.printf("q = %d a = %d \n",q,a);
       System.out.printf("w = %d a = %d \n",w,a);

       int a1 = 1;
       int b1  = a1++;
       b1+= a1++;
       System.out.printf("b1 %d",b1);
    }
}
