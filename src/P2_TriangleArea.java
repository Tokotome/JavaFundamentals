import java.util.Scanner;
public class P2_TriangleArea {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int aX = scanner.nextInt();
	int aY = scanner.nextInt();
	System.out.println();
	int bX = scanner.nextInt();
	int bY = scanner.nextInt();
	System.out.println();
	int cX = scanner.nextInt();
	int cY = scanner.nextInt();
	
	double area = (aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY))/2;
	if (area<=0) {
		System.out.println("0");
	}
	else {
		System.out.printf("%.0f", Math.abs(area));
	}
	scanner.close();
}
}
