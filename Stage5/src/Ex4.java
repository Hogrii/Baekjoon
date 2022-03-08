import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ex4 {
	public static void main(String[] args) throws IOException{
		// BufferedReader�� Scanner ��ſ� �Է��� ���� �� �ִ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// HashSet�� �ߺ��Ǵ� ���Ҹ� ���� ��� �ϳ��� �����Ѵ�.
		// HashSet�� ���� ������ ����.
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			// .add�� HashSet�� �Է��ϴ� �޼ҵ��̴�.
			// BufferedReader�� ����߱� ������ .readLine�� �̿��� ���� �޾��ش�.
			// => sc.nextLine()�� ���� �����̴�.
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		// HashSet�� ũ�⸦ ����ϸ� ���δٸ� ���ڸ� ����Ǿ� �ֱ� ������ ���� �ٸ� �������� ���� ����� �� �ִ�.
		System.out.print(h.size());		
		}
}