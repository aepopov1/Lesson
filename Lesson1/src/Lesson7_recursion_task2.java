/**
 * Вычислить и записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы
 */
public class Lesson7_recursion_task2 {
    static int[] sampleNum = new int[10]; //создадим массив для рекурсии
    //sampleNum[0] = 2; // хм. интересно, почему не работает тут
    public static void main(String[] args) {
        //вызов метода без рекурсии. Используем void
        getSampleNumbers(10);  // 10 - количество элементов в массиве

        //вызов метода рекурсии
        sampleNum[0] = 2; //присвоим первый элемент
        getSampleNumbersRecursion(0);
        int sum = getSumArray(sampleNum, 0);
        System.out.printf("Сумма простых чисел, посчитанная в рекурсии %d", sum);
    }

    static void getSampleNumbers(int number) {
        int[] snum = new int[number];
        snum[0] = 2; //первый элемент = 2

        int sampleNumber = 3; //присвоим первое простое число после 2

        while (1 == 1) {
            for (int i = 0; i < snum.length; i++) {
                if (snum[i] == 0) {  //если дошли до элемента массива и он = 0, значит перебор всех элементов закончили и, если мы еще не вышли из цикла, то запишем новое найденное простое число
                    snum[i] = sampleNumber;
                    break;
                }
                if (sampleNumber % snum[i] == 0) //если число делится без остатка на простое число из найденных уже в массиве, то выходим из цикла
                    break;
            }
            sampleNumber += 2; //берем следующее число. четные пропускаем, нет смысла тратить время
            if (snum[snum.length - 1] != 0) //выходим, так как заполнили весь массив
                break;
        }
        //подсчет суммы
        int sum = getSumArray(snum, 0);
        System.out.printf("Сумма простых чисел без рекурсии %d\n", sum);
    }

    // реализация метода через рекурсию
    static int getSampleNumbersRecursion(int n) {
        if (sampleNum[sampleNum.length - 1] != 0) //заполнили полностью массив
            return 0;

        int sampleNumber = (n == 0) ? 3 : n; // надо поиспользовать тернарный оператор, а то забудется). При первом запуске возьмем простое число 3, иначе то, что вернула рекурсия

        for (int i = 0; i < sampleNum.length; i++) {
            if (sampleNum[i] == 0) {  //если дошли до элемента массива и он = 0, значит перебор всех элементов закончили и, если мы еще не вышли из цикла, то запишем новое найденное простое число
                sampleNum[i] = sampleNumber;
                break;
            }
            if (sampleNumber % sampleNum[i] == 0) //если число делится без остатка на простое число из найденных уже в массиве, то выходим из цикла
                break;
        }
        getSampleNumbersRecursion(sampleNumber + 2); //проверка следующего числа
        return 0;
    }

    static int getSumArray(int number[], int i) {
        if (i == number.length - 1)
            return number[i];
        int sum = number[i] + getSumArray(number, i + 1);
        return sum;
    }
}
