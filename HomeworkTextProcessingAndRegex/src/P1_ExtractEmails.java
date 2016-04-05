import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1_ExtractEmails {
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	String text = input.nextLine();
	
	Pattern pattern = Pattern.compile("(\\b\\w+[-._]*\\w+\\b)@(([a-z]+[-]*[a-z]*)\\.)+([a-z]+)");
	Matcher matcher = pattern.matcher(text);
	
	while(matcher.find()){
	System.out.println(matcher.group());
	}
	input.close();
	}
}

