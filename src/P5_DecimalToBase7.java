import java.util.Scanner;
 
public class P5_DecimalToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(Integer.toString(Integer.parseInt(a, 10), 7));
        scanner.close();
        }
}
