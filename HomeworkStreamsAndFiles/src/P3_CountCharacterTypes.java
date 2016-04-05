
import java.io.*;


public class P3_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String vowelsSymbols = "aeiou";
        String punctuationSymbols = "!.,?";
        //make variables for count of each type of symbols
        Integer consonants = 0;
        Integer vowels = 0;
        Integer punctuation = 0;
        
        //link the application with the existing file and create a new to store the count of chars
        FileInputStream file = new FileInputStream(new File("words.txt"));
        FileWriter secondFile = new FileWriter(new File("count-chars.txt"));
        int symbol;
        while((symbol = file.read())!=-1)
        {
            char ch = (char)symbol;
            if(vowelsSymbols.contains(ch+"")){
                vowels++;
            }else if(punctuationSymbols.contains(ch+"")){
                punctuation++;
            }else if(Character.isLetter(ch)){
                consonants++;
            }
        }
        secondFile.write(String.format("Vowels: %d%n",vowels));
        secondFile.write(String.format("Consonants: %d%n",consonants));
        secondFile.write(String.format("Punctuation: %d%n",punctuation));
        file.close();
        secondFile.flush();
        secondFile.close();
        
    }
}
	

