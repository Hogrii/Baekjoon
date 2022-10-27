import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10815 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> sameMap = new HashMap<Integer, Integer>();
		
		// ������ ī�� ����
		int N = Integer.parseInt(br.readLine());
		int cardNum[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		// ������ ī�� ����
		for(int i=0; i<N; i++) {
			cardNum[i] = Integer.parseInt(st.nextToken());
		}
		
		// ���� ī�� ����
		int M = Integer.parseInt(br.readLine());
		int compareCard[] = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		
		// ���� ī�� ����
		for(int i=0; i<M; i++) {
			compareCard[i] = Integer.parseInt(st.nextToken());
		}
		
		int exist = 1;
		for(int key : cardNum) {
			// ������ ī�带 key������ value 1 ����
			if(!sameMap.containsKey(key)) {
				sameMap.put(key, exist);
			}
		}
		
		// ���
		int ownCard = 0;
		for(int key : compareCard) {
			// ���� ī���� ���ڰ� ������ ī���� key���� �����ϴٸ�
			if(sameMap.containsKey(key)) {
				// value���� ������ ���
				ownCard = sameMap.get(key);
			// �������� �ʴٸ�
			}else {
				// 0�� ���
				ownCard = 0;
			}
			sb.append(ownCard).append(" ");
		}
		System.out.println(sb);		
	}
}
