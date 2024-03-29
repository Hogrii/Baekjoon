import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10807 {
	public static void main(String[] args) throws IOException{
		// ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int compare = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			if(arr[i] == compare) cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
