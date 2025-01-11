import Classes.InputControl;


public class Main {
    public static void main(String[] args) {

        System.out.println(InputControl.validateInput("user_name123", "pass_1234", "pass_1234")); // true

        // Тестирование с невалидным логином
        System.out.println(InputControl.validateInput("user@name", "pass_1234", "pass_1234")); // false

        // Тестирование с невалидным паролем
        System.out.println(InputControl.validateInput("username", "pass#1234", "pass#1234")); // false

        // Тестирование с несовпадающими паролями
        System.out.println(InputControl.validateInput("username", "pass_1234", "pass_12345")); // false
    }
}


