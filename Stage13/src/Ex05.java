import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex05 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<String, String> matchMap = new HashMap<String, String>();
		
		st = new StringTokenizer(br.readLine(), " ");
		// �赵 ���� ����� ��
		int N = Integer.parseInt(st.nextToken());
		// ���� ���� ����� ��
		int M = Integer.parseInt(st.nextToken());
		
		String[] noListen = new String[N];
		String[] noSee = new String[M];
		
		// �赵 ���� �����
		for(int i=0; i<N; i++) {
			noListen[i] = br.readLine();
		}
		
		// ���� ���� �����
		for(int i=0; i<M; i++) {
			noSee[i] = br.readLine();
		}
		
		// ���� ���� ����� ����
		Arrays.sort(noSee);
		
		// �赵 ���� ������� key�� �߰�
		for(String key : noListen) {
			matchMap.put(key, key);
		}
		
		// �赵 ���� ���� ����� ī��Ʈ
		int count = 0;
		for(String key : noSee) {
			// ���� ���� ����� �̸��� key�� �ִٸ� value�� ���
			// �赵 ���� ���� ����� ī��Ʈ +1
			if(matchMap.containsKey(key)) {
				sb.append(key).append('\n');
				count++;
			}
		}
		System.out.println(count);
		System.out.println(sb);
	}
}
