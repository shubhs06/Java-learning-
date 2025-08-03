package FileHandling;

import java.io.*;

// Custom Exception
class UnderAgeException extends Exception {
    public UnderAgeException(String name) {
        super(name + " is underage.");
    }
}

public class UserFileReader {

    public static void main(String[] args) {
        File file = new File("src//FileHandling//userdata.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                try {
                    if (age < 18) {
                        throw new UnderAgeException(name);
                    } else {
                        System.out.println(name + " is allowed.");
                    }
                } catch (UnderAgeException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader.");
            }
        }
    }
}
