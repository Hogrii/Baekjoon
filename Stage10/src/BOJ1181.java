import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// �ܾ��� ��
		int N = Integer.parseInt(br.readLine());
		// �ܾ� �迭
		String arr[] = new String[N];
		
		// �ܾ� �Է�
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		// �ܾ� ����
		Arrays.sort(arr, (s1, s2) -> {
			// �ܾ��� ���̰� ������
			if(s1.length() == s2.length()) {
				// �� �ܾ��� ���ĺ� ���� ��
				return s1.compareTo(s2);
			// �ܾ��� ���̰� �ٸ���
			}else {
				// �ܾ��� ������ ���� -> ����, 0, ���
				return s1.length() - s2.length();
			}
		});
		
		// ù��° �ܾ� ���
		sb.append(arr[0]).append('\n');
		// �ι�°���� ���������� �ߺ� ���� �� ���
		for(int i=1; i<arr.length; i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');				
			}
		}
		System.out.println(sb);		
	}
}
