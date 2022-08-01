import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex06 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		// A���� ������ ��
		int A = Integer.parseInt(st.nextToken());
		// B���� ������ ��
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		// A���� ���ҵ� �Է�
		for(int i=0; i<A; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		// B���� ���ҵ� �Է�
		for(int i=0; i<B; i++) {
			setB.add(Integer.parseInt(st.nextToken()));
		}
		
		// ��Ī ������ ī��Ʈ
		int SDS = 0;
		for(int key : setA) {
			// A������ ���� B���տ� ������
			if(!setB.contains(key)) {
				// ��Ī ������ +1
				SDS++;
			}
		}
		for(int key : setB) {
			// B������ ���� A���տ� ������
			if(!setA.contains(key)) {
				// ��Ī ������ +1
				SDS++;
			}
		}
		// ���
		System.out.println(SDS);
	}
}
