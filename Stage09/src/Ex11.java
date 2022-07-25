import java.util.Scanner;

public class Ex11 {
	public static int get_result(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int xy_pow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if(x1==x2&&y1==y2&&r1==r2) {
			return -1;
		}else if(xy_pow>Math.pow(r1+r2, 2)) {
			return 0;
		}else if(xy_pow<Math.pow(r1-r2, 2)) {
			return 0;
		}else if(xy_pow==Math.pow(r2-r1, 2)) {
			return 1;
		}else if(xy_pow==Math.pow(r1+r2, 2)) {
			return 1;
		}else {
			return 2;
		}
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(get_result(x1,y1,r1,x2,y2,r2));
		}
	}
}