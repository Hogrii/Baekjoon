import java.util.Scanner;

public class Ex04 {
	public static boolean[] prime;	
	// �����佺�׳׽��� ü
	public static void get_prime() {
		// 0�� 1�� �Ҽ����� ����
		prime[0] = prime[1] = true;
		// Max Number�� N�� �����ٰ� ���ų� ���� ���� ����� ����
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			// prime[i] == true
			if(prime[i]) {
				continue;
			}
			// i�� ���������� i�� ����� �ش��ϴ� ������ ����
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		prime = new boolean[N+1];
		get_prime();
		
		for(int i=M; i<=N; i++) {
			// prime[i] == false
			if(!prime[i]) {
				System.out.println(i);
			}
		}
	}
}

/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
int M = Integer.parseInt(st.nextToken());	
int N = Integer.parseInt(st.nextToken());
		
boolean notPrime [] = new boolean[N+1];
notPrime[0] = notPrime[1] = true;
		
int sqrt = (int)Math.sqrt(N);
System.out.println("sqrt : " + sqrt);
for(int i=2; i<sqrt; i++) {
	for(int j=2; j<=N/i; j++) {
		if(notPrime[i*j] == true) {
			continue;
		}else {
			notPrime[i*j] = true;
		}
	}
}
for(int i=M; i<=N; i++) {
	if(notPrime[i] == false) {
		System.out.println(i);
	}
}
*/