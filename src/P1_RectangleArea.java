import java.util.Scanner;
public class P1_RectangleArea {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int a = Integer.parseInt(console.nextLine());
	int b = Integer.parseInt(console.nextLine());
	console.close();
	System.out.println(a*b);
}
}
