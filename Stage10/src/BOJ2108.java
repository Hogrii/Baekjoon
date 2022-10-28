import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2108 {
	public static void main(String[] args) throws IOException{
		// ≈Î∞Ë«–
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayList<Integer> modeArr = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ªÍº˙∆Ú±’
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		int avg = (int)Math.round((double)sum/N);
		System.out.println(avg);
		
		// ¡ﬂæ”∞™
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
		
		// √÷∫Û∞™
		int cnt = 1;
		int maxCnt = 0;
		int maxVal = 1;
		int secondVal = 1;
		
		if(N==1) System.out.println(arr[0]);
		else {
			for(int i=1; i<arr.length; i++) {
				if(arr[i-1]==arr[i]) {
					cnt++;
				}else {
					if(maxCnt<=cnt) {
						maxVal = arr[i];
						secondVal = maxVal;
						maxCnt = cnt;
						for(int j=0; j<maxCnt; j++) {
							modeArr.add(arr[i]);							
						}
						cnt = 1;
					}
				}
				
				if(i==arr.length) {
					if(maxCnt<=cnt) {
						maxVal = arr[i];
						secondVal = maxVal;
						for(int j=0; j<maxCnt; j++) {
							modeArr.add(arr[i]);							
						}
					}
				}
			}
		}
		if(secondVal==1) {
			System.out.println(maxVal);
		}else {
			int modeLength = modeArr.size();
			System.out.println(modeArr[1]<>);
		}
		
		// π¸¿ß
		System.out.println(arr[N-1]-arr[0]);
		
	}
}
