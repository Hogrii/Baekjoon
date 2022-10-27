import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2563 {
	public static void main(String[] args) throws IOException{
		// »öÁ¾ÀÌ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int paper = Integer.parseInt(br.readLine());
		int[][] area = new int[100][100];
		int cnt = 0;
		
		for(int i=0; i<paper; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(area[j][k] != 1) {
						area[j][k] = 1;
						cnt++;
//						System.out.println(j + " " + k);
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
