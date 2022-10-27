import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2566 {
	public static void main(String[] args) throws IOException{
		// �ִ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// ������ ����
		int[][] board = new int[9][9];
		// �ִ밪 ���� ����
		int max = 0;
		// ��ǥ ���� ����
		int x = 0, y = 0;
		
		// �����ǿ� �� �Է�
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				// �ִ밪���� ������ ���� Ŭ ���
				if(board[i][j]>max) {
					// �ִ밪 ����
					max = board[i][j];
					// ��ǥ ����
					x = i;
					y = j;
				}
			}
		}
		// ������ ������ 1���� �����̱� ������ +1
		x++;
		y++;
		
		// ���
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
