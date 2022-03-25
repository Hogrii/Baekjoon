import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] body = new int[N][2];
		int[] ranking = new int[N];
		
		for(int i=0; i<N; i++) {
			// ������
			body[i][0] = sc.nextInt();
			// Ű
			body[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			// ��ŷ ��
			int rank = 1;
			for(int j=0; j<N; j++) {
				if(i==j) continue;
				
				if(body[i][0]<body[j][0] && body[i][1]<body[j][1]) {
					rank++;
				}
			}
			// ��ŷ �Է�
			ranking[i] = rank;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(ranking[i]);
		}		
	}
}