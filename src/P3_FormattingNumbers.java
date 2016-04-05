import java.util.Scanner;
public class P3_FormattingNumbers {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	//Input
	int firstNumber = input.nextInt();
	double secondNumber = input.nextDouble();
	double thirdNumber = input.nextDouble();
	
	//The number in HEX
	String numberInHex = Integer.toHexString(firstNumber).toUpperCase();
	String numberInBinary = String.format("%10s",Integer.toBinaryString(firstNumber)).replace(' ', '0');
	
	if (thirdNumber% 1 ==0) {
		System.out.printf("|%-10s|%s|%10.2f|%-10.0f|", numberInHex, numberInBinary, secondNumber, thirdNumber);
	}
	else {
		System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", numberInHex, numberInBinary, secondNumber, thirdNumber);
	}
	input.close();
}
}
