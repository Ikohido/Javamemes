import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderByCriteries2 {
    String id;
    String name;
    String surname;
    String city;
    String birthday;
    String salary;
    String profession;
    String fired;

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salary='" + salary + '\'' +
                ", profession='" + profession + '\'' +
                ", fired='" + fired + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        String csvFile = "C:/Javapars/employees.csv";
        String line = "";
        String csvSplitBy = ",";
        try (BufferedReader bruh = new BufferedReader(new FileReader(csvFile))) {
            while ((line = bruh.readLine()) != null) {
                String[] description = line.split(csvSplitBy);
                ArrayList list = new ArrayList();
                ReaderByCriteries2 Readd = new ReaderByCriteries2();
                Readd.id = description[0].trim();
                Readd.name = description[1].trim();
                Readd.surname = description[2].trim();
                Readd.city = description[3].trim();
                Readd.birthday = description[4].trim();
                Readd.salary = description[5].trim();
                Readd.profession = description[6].trim();
                Readd.fired = description[7].trim();
                list.add(Readd);
                System.out.println(Readd);
            }

        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}





