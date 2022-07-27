import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex10 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int ori[] = new int[N];
		int sort[] = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			ori[i] = sort[i] = Integer.parseInt(st.nextToken());			
		}
		
		Arrays.sort(sort);
		
		int rank = 0;
		for(int key : sort) {
			if(!rankingMap.containsKey(key)) {
				rankingMap.put(key, rank);
				rank++;
			}
		}
		
		for(int key : ori) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(" ");			
		}
		System.out.println(sb);
	}
}