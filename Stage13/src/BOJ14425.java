import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ14425 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<String, Integer> checkMap = new HashMap<String, Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		// ���� S�� ���ڿ� ��
		int N = Integer.parseInt(st.nextToken());		
		String strSet[] = new String[N];
		// �˻��� ���ڿ� ��
		int M = Integer.parseInt(st.nextToken());
		String strCheck[] = new String[M];
		
		// ���� S�� ���ڿ� �Է�
		for(int i=0; i<N; i++) {
			strSet[i] = br.readLine();
		}
		
		// �˻��� ���ڿ� �Է�
		for(int i=0; i<M; i++) {
			strCheck[i] = br.readLine();
		}
		
		// key�� ���� S�� ���ڿ��� �Է�, value�� 1 �Է�
		for(String key : strSet) {
			checkMap.put(key, 1);
		}
		
		// ��ġ�ϴ� ���ڿ��� ���� ���� ����
		int exist = 0;
		for(String key : strCheck) {
			// checkMap�� �˻��� ���ڿ��� key�� ����� �Ǿ��ִٸ�
			if(checkMap.containsKey(key)) {
				// �����ϱ� ������ +1
				exist++;
			}
		}
		// ���
		System.out.println(exist);
	}
}
