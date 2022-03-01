import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(C <= B) {
			System.out.println("-1");
		}else {
			System.out.println((A/(C-B))+1);
		}
	}
}