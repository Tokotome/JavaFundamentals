import java.io.*;

public class P4_CopyJpegFile {
	
    static final File firstFile = new File("softuni.jpg");
    static final File newFile  = new File("softuni(copy).jpeg");

    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream(firstFile);
             FileOutputStream writer = new FileOutputStream(newFile)) {
            Integer readedBytes;
            while ((readedBytes = reader.read()) != -1) {
                writer.write(readedBytes);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Sorry, the file was not found!");
        } catch (IOException iore) {
           System.out.println("Sorry, try again! :)");
        }
    }
}