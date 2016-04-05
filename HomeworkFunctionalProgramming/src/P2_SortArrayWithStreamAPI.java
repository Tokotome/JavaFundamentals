import java.util.Scanner;
import java.util.Arrays;

public class P2_SortArrayWithStreamAPI {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]numbers = input.nextLine().split("\\s+");
        String order = input.nextLine();
        
        
        if (order.equals("Ascending")){
            Arrays.stream(numbers)
                    .map(d -> Integer.parseInt(d))
                    .sorted()
                    .forEach(d -> System.out.printf("%d ", d));
        }else if(order.equals("Descending")){
            Arrays.stream(numbers)
                    .map(d -> Integer.parseInt(d))
                    .sorted((d1, d2) ->d2.compareTo(d1))
                    .forEach(d -> System.out.printf("%d ", d));
        }else{
        	System.out.println("Invalid order of the numbers");
        }
        input.close();
	}
}
