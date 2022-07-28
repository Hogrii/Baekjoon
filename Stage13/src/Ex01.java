import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> sameMap = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int cardNum[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			cardNum[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int compareCard[] = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<M; i++) {
			compareCard[i] = Integer.parseInt(st.nextToken());
		}
		
		int exist = 1;
		for(int key : cardNum) {
			if(!sameMap.containsKey(key)) {
				sameMap.put(key, exist);
			}
		}
		
		int ownCard = 0;
		for(int key : compareCard) {
			if(sameMap.containsKey(key)) {
				ownCard = sameMap.get(key);
			}else {
				ownCard = 0;
			}
			sb.append(ownCard).append(" ");
		}
		System.out.println(sb);		
	}
}
