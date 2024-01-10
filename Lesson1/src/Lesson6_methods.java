public class Lesson6_methods {
    public static void main(String[] args) {
        hello();
        welcome();

        int c = summa(1,2);
        System.out.println(c);
    }
    static void hello(){
        System.out.println("Hello");
    }
    static void welcome(){
        System.out.println("Welcome");
    }

    static int summa (int a, int b){
        int c = a + b;
        return c;
    }
}
