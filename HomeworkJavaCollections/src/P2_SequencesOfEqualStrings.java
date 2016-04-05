import java.util.ArrayList;
import java.util.Scanner;


public class P2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//enter the string
		String text = input.nextLine();
		//divide it into different string and put them into an array
		String[] arrayOfStrings = text.split(" ");
		//create a new, final list
		ArrayList<String> results = new ArrayList<String>();
		results.add(arrayOfStrings[0]);
		
		if (arrayOfStrings.length == 1) {
			System.out.println(arrayOfStrings[0]);
		}
		
		for (int i = 0; i < arrayOfStrings.length - 1; i++) {
			if (arrayOfStrings[i].equals(arrayOfStrings[i + 1])) {
				results.add(arrayOfStrings[i + 1]);
				if (i == arrayOfStrings.length - 2) {
					printSequence(results);					
				}
			} else {
				printSequence(results);
				System.out.println();
				results.clear();
				results.add(arrayOfStrings[i + 1]);
				if (i == arrayOfStrings.length - 2) {
					printSequence(results);					
				}
			}
		}
    input.close();
	}

	public static void printSequence(ArrayList<String> results) {
		for (String result : results) {
			System.out.print(result + " ");
		}
	}

}