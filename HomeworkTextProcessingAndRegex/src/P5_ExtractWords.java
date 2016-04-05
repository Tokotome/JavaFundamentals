import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P5_ExtractWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        Pattern pat = Pattern.compile("[A-Za-z][A-Za-z]+");
        Matcher match = pat.matcher(text);
        while (match.find()){
            System.out.printf("%s ",match.group());
        }
        input.close();
    }
}