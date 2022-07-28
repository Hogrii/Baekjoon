import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<String, Integer> pokeMap = new HashMap<String, Integer>();
		
		// ������ ���ϵ� ���ϸ��� ��
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		String pokeDex[] = new String[N];
		
		// ������� ������ ��
		int M = Integer.parseInt(st.nextToken());
		ArrayList<String> pokeCheck = new ArrayList<>();
		
		// ���ϸ� ���� �Է�
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			pokeDex[i] = st.nextToken();
		}
		
		// ������� ���� �Է�
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			pokeCheck.add(st.nextToken());
		}
		
		// ���ϸ� ������ 1������ ����
		int pokeDexNum = 1;
		for(String key : pokeDex) {
			// ���ϸ��� ��ȣ�� ����
			pokeMap.put(key, pokeDexNum);
			// ���� �� ���� ���� ��ȣ�� ���� ����
			pokeDexNum++;
		}
		
		// ���ϸ� ���� ���
		for(String key : pokeCheck) {
			// ������� ������ ���ڿ� �Ǵ� ���ڷ� �ԷµǱ� ������ ������ �ʿ�
			if(isInteger(key)) {
				// �Էµ� ���� ���ڶ�� int������ ��ȯ
				int poketNum = Integer.parseInt(key);
				// ������ 1���� ����, �迭�� 0���� �����̱� ������ 1�� ���ش�.
				sb.append(pokeDex[poketNum-1]).append('\n');
			}else {
				// �Էµ� ���� ���ڿ��̶�� key���� �̿��� ���ϸ� �������� ��ȣ�� ���
				int poketMon = pokeMap.get(key);
				sb.append(poketMon).append('\n');
			}
		}
		// ���
		System.out.println(sb);
	}
	
	// �Էµ� ���� ���ڿ����� �������� �����ϱ� ���� �޼ҵ�
	public static boolean isInteger(String pokeCheck) {
		try {
			// �Էµ� ���� ���ڸ� true ��ȯ
			Integer.parseInt(pokeCheck);
			return true;
		}catch(Exception e) {
			// �Էµ� ���� ���ڿ��̸� false ��ȯ
			return false;
		}
	}
}
