package FileHandling;

import java.io.*;

public class CreateUserDataFile {
    public static void main(String[] args) {
        String data = "Alice 23\nBob 19\nCharlie 17\nDavid 16\nEva 25";
        try {
            FileWriter writer = new FileWriter("src//FileHandling//userdata.txt");
            writer.write(data);
            writer.close();
            System.out.println("userdata.txt created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }
    }
}
