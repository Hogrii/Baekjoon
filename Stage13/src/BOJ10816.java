import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> cardMap = new HashMap<Integer, Integer>();
		
		// �����ϰ� �ִ� ī���� ��
		int N = Integer.parseInt(br.readLine());
		int CardNum[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		// ���� ī���� ���ڵ�
		for(int i=0; i<N; i++) {
			CardNum[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// ���� ī���� ��
		int M = Integer.parseInt(br.readLine());
		int CompareCard[] = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		
		// ���� ī���� ���ڵ�
		for(int i=0; i<M; i++) {
			CompareCard[i] = Integer.parseInt(st.nextToken());
		}
		
		// ������ ī�带 ����
		Arrays.sort(CardNum);
		
		// ���� ���� ī�� ī��Ʈ
		int stack = 1;
		for(int i=0; i<CardNum.length; i++) {
			int exist = 1;
			int key = CardNum[i];
			// �ߺ��� ī�尡 2�� �̻��� ���
			if(cardMap.containsKey(key)) {
				stack++;
				cardMap.put(key, stack);
			// �ߺ��� ī�尡 ���� ���
			}else {
				cardMap.put(key, exist);
				// ������ 1�� �ʱ�ȭ
				stack = 1;
			}
		}
		
		// ���� �ִ� ī���� �� ���
		int ownCard = 0;
		for(int key : CompareCard) {
			// key�� ��ϵ� ī�尡 �ִٸ� �� value�� ���
			if(cardMap.containsKey(key)) {
				ownCard = cardMap.get(key);
				sb.append(ownCard).append(" ");
			// key�� ��ϵ� ī�尡 ���ٸ� 0�� ���
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}
}
