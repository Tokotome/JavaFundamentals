import java.util.Arrays;
import java.util.Scanner;


public class P1_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//enter a number for a range of the array
		try{
		int n = input.nextInt();
		input.nextLine();
		//create the array
		int[] numbers = new int[n];
		//enter the value of each variable in the array using loop
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		//sort the numbers
		Arrays.sort(numbers);
		//print sorted numbers
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		}
     finally{
     input.close();
     }
     }
	}
