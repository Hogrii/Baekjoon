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
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] noListen = new String[N];
		String[] noSee = new String[M];
		
		for(int i=0; i<N; i++) {
			noListen[i] = br.readLine();
		}
		
		for(int i=0; i<M; i++) {
			noSee[i] = br.readLine();
		}
		
		Arrays.sort(noSee);
		
		for(String key : noListen) {
			matchMap.put(key, key);
		}
		
		int count = 0;
		for(String key : noSee) {
			if(matchMap.containsKey(key)) {
				sb.append(key).append('\n');
				count++;
			}
		}
		System.out.println(count);
		System.out.println(sb);
	}
}
