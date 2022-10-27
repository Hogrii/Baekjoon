import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10989 {
	public static void main(String[] args) throws IOException{
		// BufferedReader�� �̿��ϸ� Scanner���� ó�� �ӵ��� ������.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder�� �̿��ϸ� ���ڿ��� �ٷ�Ⱑ �� ����.
		StringBuilder sb = new StringBuilder();
		
		// ���� ����
		int arr[] = new int[Integer.parseInt(br.readLine())];
		
		// ������ ���ڵ�
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// �Է� �� BufferedReader�� �ݾ��ش�.
		br.close();
		
		// ����
		Arrays.sort(arr);
		
		// ���
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append('\n');
		}		
		System.out.println(sb);
	}
}