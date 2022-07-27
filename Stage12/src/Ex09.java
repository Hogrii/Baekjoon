import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex09 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// ȸ���� ��
		int N = Integer.parseInt(br.readLine());
		// ȸ�� �迭
		String arr[][] = new String[N][2];
		
		// ȸ�� ���� -> ����, �̸�
		for(int i=0; i<N; i++) {
			// " "�� �������� 0�� ����, 1�� �̸� �Է�
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		// ����
		Arrays.sort(arr, (s1, s2) -> {
			// ���̼����� ����
			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
		});
		
		// ���
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}