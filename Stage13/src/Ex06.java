import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex06 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> setA = new HashSet<>(); // 1 2 4
		Set<Integer> setB = new HashSet<>(); // 2 3 4 5 6
		
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<A; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<B; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		int SDS = 0;
		for(int key : setA) {
			if(!setB.contains(key)) {
				SDS++;
			}
		}
		for(int key : setB) {
			if(!setA.contains(key)) {
				SDS++;
			}
		}
		System.out.println(SDS);
	}
}
