import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bruh = new BufferedReader(new FileReader("C:/Javapars/report-30-11-2022.csv"))) // path to file which we need  to read.
        {

            int c;
            while ((c = bruh.read()) != -1) { //initialization and read symbol by symbol all file.

                System.out.print((char) c); // output all file in console.
            }
        } catch (IOException problems) { // initialization catch construction and names it "problems".
            // catch is construction which handle code and check errors.

            System.out.println(problems.getMessage()); // if exists any errors, they will show to us in console.
        }
    }
}
