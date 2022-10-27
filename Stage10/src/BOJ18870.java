import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		// ��ǥ�� ��
		int N = Integer.parseInt(br.readLine());
		// ��ǥ �迭
		int ori[] = new int[N];
		// ��ǥ ���� �迭
		int sort[] = new int[N];
		
		// ��ǥ�� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		
		// ��ǥ �迭, ��ǥ ���� �迭�� �� �Է�
		for(int i=0; i<N; i++) {
			ori[i] = sort[i] = Integer.parseInt(st.nextToken());			
		}
		
		// ��ǥ ����
		Arrays.sort(sort);
		
		// key ���� ���� ��ŷ ��
		int rank = 0;
		for(int key : sort) {
			// ��ŷ �ߺ� ����
			if(!rankingMap.containsKey(key)) {
				// �ش� key ���� ��ŷ �� �Է�
				rankingMap.put(key, rank);
				// ��ŷ �Է� �� +1 �߰�
				rank++;
			}
		}
		
		// ���
		// ��ǥ���� ��ŷ ��������
		for(int key : ori) {
			// map���� ��ŷ key���� ���� ��ŷ value ��������
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(" ");			
		}
		System.out.println(sb);
	}
}