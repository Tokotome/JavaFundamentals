import java.util.Scanner;
public class P2_CountSubstringOccurrences {
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	String findStr = input.nextLine();
	int lastIndex = 0;
	int count = 0;

	while(lastIndex != -1){

	    lastIndex = str.indexOf(findStr,lastIndex);

	    if(lastIndex != -1){
	        count ++;
	        lastIndex += findStr.length();
	    }
	    input.close();
	}
	System.out.println(count);
}
}
