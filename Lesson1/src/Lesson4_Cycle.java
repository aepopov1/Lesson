//Lesson 4. Циклы. Виды

import java.util.Arrays;

public class Lesson4_Cycle {
    public static void main(String[] args) {

        //цикл for
        for (int i = 1; i < 10; i++) {
            System.out.printf("Число цикла %d \n", i);
        }

        //цикл do while.
        //Особенность цикла в том, что он выполняет тело цикла и только потом проверяет. Т.е. как минимум 1 раз будет исполнен
        int j = 15;
        do {
            System.out.printf("Цикл do. Число %d \n", j);
            j++;
        }
        while (j < 11);

        //цикл while сначала определяет условия, потом исполняет тело цикла
        int z = 1;
        while (z < 10) {
            System.out.printf("Цикл while. Число: %d \n", z);
            z++;
        }

        //работа break continue
        //break прерывает работу цикла
        for (int a = 1; a < 10; a++) {
            if (a == 5)
                break;
            System.out.printf("Break Число цикла %d \n", a);
        }
        //coninue завершает исполнение текущей итерации цикла и продолжает работу дале
        for (int a = 1; a < 10; a++) {
            if (a == 5)
                continue;
            System.out.printf("Continue Число цикла %d \n", a);
        }

        int d = 2;
        int f = 0;
        for (int i = 2; i < 32; i = i * 2) {
            while (i < d) {
                d = d * 2;
                System.out.printf("Проверка %d \n", d);
            }
            i = d - i;
            System.out.printf("Значение i %d \n", i);

            f++;
            if (f == 5)
                break;
        }
    }
}
