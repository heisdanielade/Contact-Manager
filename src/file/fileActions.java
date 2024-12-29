package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileActions {
    private static String fileName = "output.txt";

    public static String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        fileActions.fileName = fileName;
    }

    // read from file
    public static void read() {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
               System.out.println(line);
            }
        } catch (
                IOException e) {
            e.getStackTrace();
        }
    }


}
