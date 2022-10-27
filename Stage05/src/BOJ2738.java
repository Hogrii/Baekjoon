import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2738 {
	public static void main(String[] args) throws IOException{
		// ��� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// ��� ĭ ����
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// N * M ��� ����
		int[][] MatrixA = new int[N][M];
		int[][] MatrixB = new int[N][M];
		int[][] result = new int[N][M];
		
		// A ��� �� �Է�
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				MatrixA[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// B ��� �� �Է�
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<M; j++) {
				MatrixB[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// ��� �� ���
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				result[i][j] = MatrixA[i][j] + MatrixB[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
