import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = cons(N);
		System.out.println(result);
	}
	
	public static int cons(int N) {
		for(int i=1; i<N; i++) {
			int sum = i;
			int j= i;
			while(j != 0) {
				sum = sum + (j%10);
				j = j/10;
			}
			if(sum==N) {
				return i;
			}
		}
		return 0;
	}
}