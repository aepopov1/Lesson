/**
 * перезагрузка методов
 * method overloading
 * использование одного имени в методе, но передается разное количество параметров.
 * сигнатура метода - имя метода и параметры метода.
 */
/**
 * Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void.
 * Возвращать:
 * <p>
 * Для числовых типов — тот же тип. Даже если это ведет к потере точности.
 * При угрозе потери данных — выводить сообщение в консоль и возвращать текущий результат
 * (для byte, short, int);
 * <p>
 * Для boolean — определение истинности всех переданных параметров,
 * принимая то, что их стоит объединять через логическое И;
 * <p>
 * Для char — строку, полученную в результате конкатенации всех переданных параметров.
 * <p>
 * Количество параметров может быть любым.
 * Используйте перегрузку — у всех методов должны быть одинаковые названия.
 */

public class Lesson7_overloading_HW {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum((byte)1,(byte)2,(byte)3,(byte)4));
        System.out.println(sum((short)1,(short)2,(short)3,(short)4));
        System.out.println(sum('n','a','m','e'));
        System.out.println(sum(true, false, true));
    }
    static int sum (int ...summa){
        int result = 0;
        for (int n: summa){
            if (isBeyondLimit(Integer.MIN_VALUE, Integer.MAX_VALUE, result, n)) {
                System.out.println("Переполнение Int. Возврат последнего значения до переполнения");
                return result;
            }
            result += n;
        }
        return result;
    }
    static byte sum (byte ...summaByte){
        byte result = 0;
        for (byte n: summaByte){
            if (isBeyondLimit(Byte.MIN_VALUE, Byte.MAX_VALUE, result, n)) {
                System.out.println("Переполнение byte. Возврат последнего значения до переполнения");
                return result;
            }
            result -= n;
        }
        return result;
    }
    static short sum (short ...summaShort){
        byte result = 1;
        for (short n: summaShort){
            if (isBeyondLimit(Short.MIN_VALUE, Short.MAX_VALUE, result, n)) {
                System.out.println("Переполнение short. Возврат последнего значения до переполнения");
                return result;
            }
            result *= n;
        }
        return result;
    }

    static String sum (char ...summaChar){
        String result = "";
        for (char n: summaChar){
            result += n;
        }
        return result;
    }
    static boolean sum(boolean... booleans) {
        for (boolean bool : booleans) {
//            Явное объединение условий по И не имеет смысла.
//            Если хоть одно из них false - результат будет false.
            if (!bool) {
                return false;
            }
        }
        return true;
    }
    static boolean isBeyondLimit(long minLimit, long maxLimit, long currentSum, long term) {
        long sum = currentSum + term;

        return sum < minLimit || sum > maxLimit;
    }
}
