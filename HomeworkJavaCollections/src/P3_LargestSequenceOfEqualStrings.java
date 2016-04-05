import java.util.Scanner;


public class P3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String[] arrayOfStrings = text.split(" ");
				
		int tempCount = 1;
		int count = Integer.MIN_VALUE;
		int endIndex = 0;
		int tempEndIndex = 0;
		//comapre if each element is equal to next one in the array
		for (int i = 0; i < arrayOfStrings.length - 1; i++) {
			if (arrayOfStrings[i].equals(arrayOfStrings[i + 1])) {
				tempCount++;
				tempEndIndex = i + 1;
				if (i == arrayOfStrings.length - 2) {
					if (tempCount > count) {
						count = tempCount;
						endIndex = tempEndIndex;
					}
				}
			} 
			else {
				if (tempCount > count) {
					count = tempCount;
					endIndex = tempEndIndex;
				}
				tempCount = 1;
			}
		}
		//printing the array if it has more than one element
		if (arrayOfStrings.length != 1) {
			int startIndex = endIndex - count + 1;
			for (int i = startIndex; i <= endIndex; i++) {
				System.out.print(arrayOfStrings[i] + " ");
			}
			//print the array if it has a single element inside
		} else {
			System.out.println(arrayOfStrings[0]);
		}
		input.close();
	}

}