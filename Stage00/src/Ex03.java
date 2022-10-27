import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int multiply = A*B*C;
		String str = Integer.toString(multiply);
		int[] result = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			result[Character.getNumericValue(str.charAt(i))]++;
		}
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}