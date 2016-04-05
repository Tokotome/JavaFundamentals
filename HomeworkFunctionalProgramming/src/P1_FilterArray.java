import java.util.Scanner;
import java.util.Arrays;


public class P1_FilterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]words = input.nextLine().split("\\s+");

        Arrays.stream(words)
                .filter(w -> w.length() > 3)
                .forEach(w -> System.out.printf("%s ", w));
        input.close();
    }
}