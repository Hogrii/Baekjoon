import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {
	public static void main(String[] args) throws IOException {
		// ���
		
		// 1. �� ������ ����� ���Ѵ�.
		// 2. �� ������ ����� �ְ������� ������ 100�� ���Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// ������ ��
		int N = Integer.parseInt(br.readLine());
		
		// �� ������ ����
		int[] score = new int[N];
		
		// �ְ���, ����
		int max = 0;
		double total = 0;
		
		// ���� �Է�, �ְ��� �Է�
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {			
			score[i] = Integer.parseInt(st.nextToken());
			if(score[i] > max) max = score[i];
		}
		
		// ���� �����ϱ�
		for(int i=0; i<score.length; i++) {
			total += ((double)score[i]/max)*100;
		}
		
		// �����̽� ��ճ���
		System.out.println(total/N);
	}
}

/*
// ���� �ڵ� 

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int[] score = new int[N];
double total = 0;

for(int i=0; i<score.length; i++) {
	score[i] = sc.nextInt();
}

int max = score[0];
for(int i=1; i<score.length; i++) {
	if(max<score[i]) {
		max = score[i];
	}
}

for(int i=0; i<score.length; i++) {
	total = total + (((double)score[i]/max)*100);
}
System.out.println(total/N);
*/