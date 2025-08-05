package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Filereader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename which you want to Open :");
        String fileName = scanner.next();

        try (FileReader reader = new FileReader(fileName)){
            int read =0;
            while ((read = reader.read()) != -1 ) {
                System.out.print((char)read);
                
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Given Filename File Not found");
        } catch (IOException e){
            System.out.println("Given input Not Match Error Occurr :"+e);
        }
    }

}
