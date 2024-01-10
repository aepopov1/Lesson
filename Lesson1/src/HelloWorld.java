public class HelloWorld {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        for(int i=0;i<10;i++){
            if (i==2)
                continue;
            System.out.println(i);
        }

        a = b;
        b = a;
        System.out.println("Значение а " + a + " Значени b " + b);

        String name;

        name = "С\na\ns\nh\na";
        int i = Integer.MIN_VALUE;

        System.out.println(name);


    }


}
