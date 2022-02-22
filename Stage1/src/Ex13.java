import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A*(B%10));
		System.out.println(A*((B%100)/10));
		System.out.println(A*((B%1000)/100));
		System.out.println(A*B);;
	}
}
