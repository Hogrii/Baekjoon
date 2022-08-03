import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		// 분자
		int numerator = 1;
		// 분모
		int denominator = 1;
		
		for(int i=N; i>N-K; i--) {
			numerator = numerator * i;
		}
		
		for(int i=K; i>1; i--) { 
			denominator = denominator * i;
		}
		
		System.out.println(numerator/denominator);
	}
}
