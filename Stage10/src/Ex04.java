
import java.util.Scanner;

public class Ex04 {
 
	public static StringBuilder sb = new StringBuilder(); 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// ������ ��
		int N = in.nextInt();

		// ���� �ű�� ����� ��
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		// ���� �ű��
		HanoiMove(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	public static void HanoiMove(int N, int start, int mid, int to) {
		// ������ 1�� ������ ��
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		} 

		// N-1���� A���� B�� �̵� (= start ������ N-1���� ������ mid �������� �ű��.)
		HanoiMove(N - 1, start, to, mid);
    
		// 1���� A���� C�� �̵� (= start ������ N��° ������ to�������� �ű��.)
		sb.append(start + " " + to + "\n");
    
		// N-1���� B���� C�� �̵� (= mid ������ N-1���� ������ to �������� �ű��.)
		HanoiMove(N - 1, mid, start, to); 
	}
}