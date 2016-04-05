import java.util.Scanner;

public class SumFromOneToN {
public static void main (String[] args){
	Scanner console = new Scanner(System.in);
	
	int number = Integer.parseInt(console.nextLine());
	int sum = 0;
	int count = 1;
	while (count<=number){
	sum+=count;
	count++;
	}
	System.out.print("The sum is "+ sum);
	console.close();
	}
}