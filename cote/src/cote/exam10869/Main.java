package cote.exam10869;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		scanner.close();
		
		int res1 = A + B;
		int res2 = A - B;
		int res3 = A * B;
		int res4 = A / B;
		int res5 = A % B;
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
	}

}
