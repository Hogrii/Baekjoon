import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];

		while(true) {
			for(int i=0; i<3; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[0]==0) {
				break;
			}else if(Math.pow(arr[0], 2)+Math.pow(arr[1], 2)==Math.pow(arr[2], 2)){
				System.out.println("right");
			}else {		
				System.out.println("wrong");
			}
		}	
	}
}