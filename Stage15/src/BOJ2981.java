import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2981 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���̿� ���� ������ ����
		int N = Integer.parseInt(br.readLine());
		int paperInNum[] = new int[N];
		
		// ���̿� ���� ���ڵ�
		for(int i=0; i<N; i++) {
			paperInNum[i] = Integer.parseInt(br.readLine());
		}
		
		// ����
		Arrays.sort(paperInNum);
		
		// �� ���ڵ� ������ ������� M�̱� ������ ���� ���Ѵ�.
		// �� ���ڵ��� ���� ������ ���� �ʰ� ���� �� ���ִ� ��
		int gcfVal = paperInNum[1] - paperInNum[0];
		
		// �ִ����� ã��
		for(int i=2; i<N; i++) {
			// �ٷ� �� �ִ������� ������ �ִ����� ����
			gcfVal = gcf(gcfVal, paperInNum[i] - paperInNum[i-1]);
		}
		
		// �ִ������� ��� ã�� �� ���
		for(int i=2; i<=gcfVal; i++) {
			if(gcfVal%i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	// �ִ����� �޼ҵ�
	public static int gcf(int a, int b) {		
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
}

//fir : for(int i=2; i<=paperInNum[N-1]; i++) { // 1 2 7
//	for(int j=1; j<paperInNum.length; j++) {
//		if(paperInNum[j-1]%i != paperInNum[j]%i) {
//			continue fir;
//		}
//		if(j == paperInNum.length-1) {
//			sb.append(i).append(" ");					
//		}
//	}			
//}		
//System.out.println(sb);
