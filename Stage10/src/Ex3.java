import java.util.Scanner;

public class Ex3 {
	public static char[][] arr;
	public static void star(int n, int x, int y) {
		if(n==1) {
			arr[x][y] = '*';
			return;
		}
		n = n/3;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1&&j==1) {
					continue;
				}else {
					star(n, x+(n*i), y+(n*j));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		arr = new char[n][n];
				
		star(n, 0, 0);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}