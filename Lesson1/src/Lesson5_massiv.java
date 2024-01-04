//массивы

public class Lesson5_massiv {
    public static void main(String[] args) {
        int[] number = new int[5]; //объявление массива

        int[] nums = new int[] {1,2,3,4,5};

        int len = number.length;

        for (int i = 0;i < number.length;i++){
            System.out.printf("\n %d",number[i]);
            System.out.printf("%d",nums[i]);
        }
        System.out.printf(" длина %d", len); //длина массива

        //иной способ задания цикла for. foreach используется для массивов или коллекций
        // в foreach есть ограничения. Нельзя изменять в таком цикле значения элементов массива
        for(int i: nums){
            System.out.println(i);
        }

        int[][] tabl = new int[5][5];

        int[] q = new int[5]; //инициализация массива 1 вариант
        int[] w = new int[] {1,2,3,4}; //инициализация массива 2 вариант
        int[] r = {1,2,3,4,5,5}; //инициализация массива 3 вариант
    }
}
