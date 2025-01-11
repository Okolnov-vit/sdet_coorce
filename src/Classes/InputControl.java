

package Classes;
import java.util.regex.Pattern;

public class InputControl {

    public static boolean validateInput(String login, String password, String confirmPassword) {
        try {
            // Проверяем логин
            if (!isValidLogin(login)) {
                throw new WrongLoginException("Login is invalid. It should contain only Latin letters, digits and underscores, and its length should be less than 20.");
            }
            // Проверяем пароль
            if (!isValidPassword(password)) {
                throw new WrongPasswordException("Password is invalid. It should contain only Latin letters, digits and underscores, and its length should be less than 20.");
            }
            // Проверяем совпадение паролей
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords do not match.");
            }
            return true; // В случае успеха
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false; // В случае неуспеха
        }
    }

    private static boolean isValidLogin(String login) {
        return login != null && login.length() < 20 && Pattern.matches("^[a-zA-Z0-9_]+$", login);
    }

    private static boolean isValidPassword(String password) {
        return password != null && password.length() < 20 && Pattern.matches("^[a-zA-Z0-9_]+$", password);
    }
}