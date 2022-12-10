import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderByCriteries {
public static void main(String[] args) {
    String csvFile = "C:/Javapars/employees.csv"; // path to file, which we need  to read.
    String line = "";
    String csvSplitBy = ",";
    try (BufferedReader bruh = new BufferedReader(new FileReader(csvFile))) {
        while ((line = bruh.readLine()) != null) {
            String[] description = line.split(csvSplitBy);

            System.out.println("id= " + description[0] + ", name=" + description[1] + ", surname=" + description[2] + ", city=" + description[3] + ", birthday=" + description[4] + ", salary=" + description[5] + ", profession=" + description[6] + ", fired=" + description[7] );
        }
    } catch (IOException exception) {
        exception.printStackTrace();
    }
}
}
