package FileHandling;
import java.io.FileWriter;
import java.io.IOException;


public class Filewrite {

    public static void main(String[] args) {
        String fileName = "My-Dreams.txt";

        try (FileWriter wr = new FileWriter(fileName)){

            wr.write("Hey Hello MySelf Ghansham Acharekar i want to become best SoftWare Engineer ");
            wr.flush();
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error Occurred");
        }


    }

}
