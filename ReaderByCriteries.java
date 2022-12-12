import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderByCriteries {

    public static void main(String[] args) {
        String csvFile = "C:/Javapars/employees.csv";
        String line = "";
        String csvSplitBy = ",";
        String values = (" id, " + "name, " + "surname, " + "city, " + "birthday, " + "salary, " + "profession, "
                + "fired ");
        ArrayList Values = new ArrayList();

        Values.add(values);
        System.out.println(Values);
        Values.clear();
        try (BufferedReader bruh = new BufferedReader(new FileReader(csvFile))) {
            while ((line = bruh.readLine()) != null) {
                String[] description = line.split(csvSplitBy);
                ArrayList list = new ArrayList();
                list.add(description[0]);
                list.add(description[1]);
                list.add(description[2]);
                list.add(description[3]);
                list.add(description[4]);
                list.add(description[5]);
                list.add(description[6]);
                list.add(description[7]);
                System.out.println(list);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
