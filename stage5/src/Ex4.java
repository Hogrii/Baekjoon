import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ex4 {
	public static void main(String[] args) throws IOException{
		// BufferedReader는 Scanner 대신에 입력을 받을 수 있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// HashSet은 중복되는 원소를 넣을 경우 하나만 저장한다.
		// HashSet은 순서 개념이 없다.
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			// .add는 HashSet에 입력하는 메소드이다.
			// BufferedReader를 사용했기 때문에 .readLine을 이용해 값을 받아준다.
			// => sc.nextLine()과 같은 개념이다.
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		// HashSet의 크기를 출력하면 서로다른 숫자만 저장되어 있기 때문에 서로 다른 나머지의 수를 출력할 수 있다.
		System.out.print(h.size());		
		}
}