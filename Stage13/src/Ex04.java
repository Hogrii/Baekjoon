import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> cardMap = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int CardNum[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			CardNum[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int M = Integer.parseInt(br.readLine());
		int CompareCard[] = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<M; i++) {
			CompareCard[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(CardNum);
		
		int stack = 1;
		for(int i=0; i<CardNum.length; i++) {
			int exist = 1;
			int key = CardNum[i];
			if(cardMap.containsKey(key)) {
				stack++;
				cardMap.put(key, stack);
			}else {
				cardMap.put(key, exist);
				stack = 1;
			}
		}
		
		int ownCard = 0;
		for(int key : CompareCard) {
			if(cardMap.containsKey(key)) {
				ownCard = cardMap.get(key);
				sb.append(ownCard).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}
}
