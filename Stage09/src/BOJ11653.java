import java.util.Scanner;

public class BOJ11653 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=2; i<N+1; i++) {
			while(N%i==0) {
				N = N/i;
				System.out.println(i);
			}
		}
	}
}