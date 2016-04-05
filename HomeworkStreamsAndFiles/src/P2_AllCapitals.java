import java.io.*;

public class P2_AllCapitals {
	//link our file in the folder with the application
    static File file= new File("lines(2).txt");
    
    //read the file and change all of the letters to capitals in each line
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line.toUpperCase() + "\r\n");
            }
            reader.close();
            
        //catch some exceptions
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        } catch (IOException iore) {
            System.out.println("Please, try again! :)");
        }
        
        //Save the new version of the file
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException iore) {
            System.out.println("Unable to overwrite the file!");;
        }
    }
}

