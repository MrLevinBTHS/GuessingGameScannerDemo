import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        try
        {
            FileReader alice = new FileReader("src/alice");
            Scanner aliceReader = new Scanner(alice);
            while(aliceReader.hasNext()){
                System.out.println(aliceReader.nextLine()); }

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }





    }
}
