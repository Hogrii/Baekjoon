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
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		String pokeDex[] = new String[N];
		
		int M = Integer.parseInt(st.nextToken());
		ArrayList<String> pokeCheck = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			pokeDex[i] = st.nextToken();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			pokeCheck.add(st.nextToken());
		}
		
		int pokeDexNum = 1;
		for(String key : pokeDex) {
			pokeMap.put(key, pokeDexNum);
			pokeDexNum++;
		}
		
		for(String key : pokeCheck) {
			if(isInteger(key)) {
				int poketNum = Integer.parseInt(key);
				sb.append(pokeDex[poketNum-1]).append('\n');
			}else {
				int poketMon = pokeMap.get(key);
				sb.append(poketMon).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static boolean isInteger(String pokeCheck) {
		try {
			Integer.parseInt(pokeCheck);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
