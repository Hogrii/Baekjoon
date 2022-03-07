import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());	
		int N = Integer.parseInt(st.nextToken());
		int inputNum = M;
		int moduleCount = 0;
		int[] numbers = new int[N-M+1];
		
		for(int i=0; i<N-M+1; i++) {
			numbers[i] = inputNum;
			inputNum++;
		}
		
		for(int i=0; i<N-M+1; i++) {
			for(int j=1; j<numbers[i]+1; j++) {
				if(numbers[i]==1) {
					continue;
				}else {
					if(numbers[i]%j == 0) {
						moduleCount++;
					}
				}
			}
			if(moduleCount==2) {
				moduleCount = 0;
				System.out.println(numbers[i]);
			}else {
				moduleCount = 0;
			}
		}
	}
}

/*
Scanner sc = new Scanner(System.in);
int M = sc.nextInt();
int N = sc.nextInt();
int inputNum = M;
int moduleCount = 0;
int[] numbers = new int[N-M+1];

for(int i=0; i<N-M+1; i++) {
	numbers[i] = inputNum;
	inputNum++;
}

for(int i=0; i<N-M+1; i++) {
	for(int j=1; j<numbers[i]+1; j++) {
		if(numbers[i]==1) {
			continue;
		}else {
			if(numbers[i]%j == 0) {
				moduleCount++;
			}
		}
	}
	if(moduleCount==2) {
		moduleCount = 0;
		System.out.println(numbers[i]);
	}else {
		moduleCount = 0;
	}
}
*/