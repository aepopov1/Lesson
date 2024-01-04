// Lesson6. Переменные. Виды и различный вывод на экран

public class Lesson6 {
    public static void main(String[] args) {
        final int B = 20; //объявление констант

        var a = 10; // объявление переменных где автоматически определяет тип
        int c = 20; // определение сразу с определенным типом

        boolean isa = false; //значение boolean

        byte x = 1; // 1 byte. -128 : 127
        short y = 2; // 2 byte -32768 : 2767
        int z = 100; // 4 byte --2147483648 : 2147483647
        long ii = 11 ; //8 byte

        //плавающая запятая
        double ss = 1.1; // 8 byte
        float yy = 1.3f; // f надо, чтобы точно определить, что значение float , так как по умолчанию преобразование в double

        System.out.println(yy);

        //символьные переменные

        char ff = 123; // можно \u0066
        System.out.println(ff);

        //строковые переменные

        String text;

        text = """
                пример много строчного текста
                который можно заключить в кавычки
                и писать сложный текст
                """;
        System.out.println(text);

        System.out.println(isa);

        System.out.println(B);
        System.out.println(a);

        Human friend = new Human(); //ссылка на класс

        System.out.println(friend);
    }
}

 class Human {
    public static void main(String[] args) {

        int age = 80;

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}