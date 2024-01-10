import java.util.Scanner;

public class Lesson6_methods_task1 {

    /**
     * Написать программу, которая принимает строку с клавиатуры.
     * Если строка == "Hi" - вывести в консоль "Hello",
     * если Bye - Good bye,
     * если How are you - How are your doing.
     * Если любая другая строка - вывести Unknown message.
     * Сделать через switch-case
     */
        public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
            Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
            System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
            String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
            word(s);
            scanner.close();

//        Используем конструкцию switch-case для переменной s
        }
        //метод переопределения сообщения
        static void word (String s){
            switch (s) {
                case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                    print("Hello");
//                Вызываем оператор break, чтобы выйти из switch-case
                    return;
                case "Bye":
                    print("Good bye");
                    return;

                case "How are you":
                    print("How are your doing");
                    return;

                default:  // Если значение s не совпадает ни с одним кейсом
                    print("Unknown message");
            }
        }
        // метод вывода на экран сообщения
        static void print (String word){
            System.out.println(word);
        }
}
