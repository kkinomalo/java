package cote.exam1001;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		
		int result;
		result = A - B;
		System.out.print(result);
	}

}
