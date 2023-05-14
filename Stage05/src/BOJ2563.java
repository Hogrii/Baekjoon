import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2563 {
	public static void main(String[] args) throws IOException{
		// ������
		// 1. ����, ���� 100ĭ¥�� �迭�� �����.
		// 2. �� �������� ������ ��ĥ�Ѵ�.
		// 3. ��ĥ�� ������ ����Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// ����, ���� 100ĭ ��ȭ��
		int[][] whitePaper = new int[100][100];
		
		// ������ ��
		int N = Integer.parseInt(br.readLine());
		
		// �����̷� ������ ����
		int covered = 0;
		
		// ������ ���� ���ϱ�
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// ������ x��ǥ
			int x = Integer.parseInt(st.nextToken());
			// ������ y��ǥ
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					// �������� ������ �ƴ� ��
					if(whitePaper[j][k] != 1) {
						// ���� �߰�
						whitePaper[j][k] = 1;
						// ���� ī��Ʈ
						covered++;
					}
				}
			}
		}
		// ���
		System.out.println(covered);
	}
}