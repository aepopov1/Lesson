public class Lesson2_sravnenie {

    public static void main (String[] args) {

        boolean a1 = (1==2) && (3<5); // c равно true, если первое выражение и второе выражение равны true, иначе c будет равно false
        System.out.println(a1);
        boolean a2 = (1==2) || (3<5); // c равно true, если хотя бы одно из выражений равно true
        System.out.println(a2);
        boolean a3 = !(2>2); // c равно true, если выражение равно false
        System.out.println(a3);
        boolean a4 = (2==2)^(3==3); // c равно true, если только одно выражение равно true. если оба выражения равны true, то ответ false
        System.out.println(a4);

        // функциии && и & , а также || и | похожи между собой. Однако && и || работают быстрее, т.к. не рассчитывают все значения.
        // Если по первому значению уже понятен ответ, то далее расчет не производится.

    }
}
