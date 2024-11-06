import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        fh.readFile();
        boolean running = true;

        while(running) {
            System.out.println("Choose");
            System.out.println("1. print list");
            System.out.println("2. sort list by region");
            System.out.println("3. sort list by age");
            System.out.println("4. exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1->{
                    fh.printData();
                }
                case 2->{
                    fh.sortByRegion();
                }
                case 3->{
                    fh.sortByAldersgruppe();
                }
                case 4->{
                    running = false;
                }
            }
        }
    }
}