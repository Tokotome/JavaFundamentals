import java.io.*;

public class P1_SumLines {
	
	//link our file in the folder with the application
	static File file= new File("lines.txt");
    public static void main(String[] args) {
    	
    	//read the text in the file and make a variable to add the number of each line
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int sumOfChars = 0;
                for (int i = 0; i < line.length(); i++) {
                    sumOfChars += line.charAt(i);
                }
               System.out.println(sumOfChars);
            }
           reader.close();
           
           //catch some exceptions
        } catch (FileNotFoundException e) {
           System.out.println("File not found!");
        } catch (IOException iore) {
        	System.out.println("Please, try again! :)");
        }
        
    }
}

