import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		if(n==0) {
			System.out.println("1");
		}else {
			for(int i=1; i<n+1; i++) {
				result = result*i;
			}
			System.out.println(result);
		}
			
	}
}