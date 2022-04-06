import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mezcla {
    public static void main(String[] args) {
        FileReader fileReader1;
        FileReader fileReader2;

        BufferedReader read1;
        BufferedReader read2;

        try {
            fileReader1 = new FileReader("f1.txt");
            fileReader2 = new FileReader("f2.txt");

            read1 = new BufferedReader(fileReader1);
            read2 = new BufferedReader(fileReader2);

            System.out.print(read1.readLine());
            System.out.print(read2.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}