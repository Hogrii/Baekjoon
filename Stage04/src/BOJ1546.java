import java.util.Scanner;

public class BOJ1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		double total = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}

		int max = score[0];
		for(int i=1; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}
		}
		
		for(int i=0; i<score.length; i++) {
			total = total + (((double)score[i]/max)*100);
		}
		System.out.println(total/N);
	}
}