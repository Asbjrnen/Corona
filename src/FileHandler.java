import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private ArrayList<Covid19Data> dataList = new ArrayList<Covid19Data>();

    public void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("11_noegletal_pr_region_pr_aldersgruppe.csv"));

        while (scanner.hasNextLine()) {
            String linje = scanner.nextLine();
            String[] data = linje.split(";");

            String region = data[0];
            String aldersgruppe = data[1];
            int BTIAlt = Integer.parseInt(data[2]);
            int døde = Integer.parseInt(data[3]);
            int ICU = Integer.parseInt(data[4]);
            int indlagte = Integer.parseInt(data[5]);
            String dato = data[6];

            Covid19Data covid19Data = new Covid19Data(region, aldersgruppe, BTIAlt, døde, ICU, indlagte, dato);
            dataList.add(covid19Data);
        }
    }
    public void printData(){
        for (Covid19Data covid19Data : dataList) {
            System.out.println(covid19Data);
        }
    }




}




