import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		if(year%4==0) {
			if(year%100!=0||year%400==0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
	}
}
