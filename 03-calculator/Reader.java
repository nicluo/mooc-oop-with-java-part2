import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInteger() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}
