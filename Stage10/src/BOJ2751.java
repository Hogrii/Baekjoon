import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		// ���� ����
		int N = sc.nextInt();
		
		// Collection.sort�� ����ϱ� ���� ArrayList ����
		ArrayList<Integer> list = new ArrayList<>();
		
		// ������ ���ڵ�
		for(int i=0; i<N; i++) {
			list.add(sc.nextInt());
		}
		
		// Collections.sort�� TimSort�̴�. -> TimSort�� �պ� / �������� �˰����� ��� 
		// Collections.sort�� ArrayList�� ����ؾ� �Ѵ�.
		Collections.sort(list);
		
		// ���
		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}
