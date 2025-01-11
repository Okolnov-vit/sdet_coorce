package Classes;

public class WrongPasswordException extends Exception {
  public WrongPasswordException() {
    super("Wrong password format, length or mismatch.");
  }

  public WrongPasswordException(String message) {
    super(message);
  }
}