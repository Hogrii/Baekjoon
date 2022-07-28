import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<String, Integer> checkMap = new HashMap<String, Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());		
		String strSet[] = new String[N];
		int M = Integer.parseInt(st.nextToken());
		String strCheck[] = new String[M];
		
		for(int i=0; i<N; i++) {
			strSet[i] = br.readLine();
		}
		
		for(int i=0; i<M; i++) {
			strCheck[i] = br.readLine();
		}
		
		for(String key : strSet) {
			checkMap.put(key, 1);
		}
		
		int exist = 0;
		for(String key : strCheck) {
			if(checkMap.containsKey(key)) {
				exist++;
			}
		}
		System.out.println(exist);
	}
}
