import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mezcla {
    public static void main(String[] args) {
        FileReader filereader1;
        FileReader filereader2;

        BufferedReader read1;
        BufferedReader read2;

        try {
            filereader1 = new FileReader("fichero1.txt");
            filereader2 = new FileReader("fichero2.txt");

            read1 = new BufferedReader(filereader1);
            read2 = new BufferedReader(filereader2);

            System.out.print(read1.readLine());
            System.out.print(read2.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}