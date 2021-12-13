package task17;

public class NameException extends Exception {
    String input;

    NameException(String input) {
        this.input = input;
    }
}
