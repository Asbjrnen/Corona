import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileHandler fh = new FileHandler();
        fh.readFile();
        fh.printData();
    }
}