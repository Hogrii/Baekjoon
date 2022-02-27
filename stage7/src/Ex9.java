import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='=') {				
				if(str.charAt(i-1)=='c' || str.charAt(i-1)=='s') {
					
				}else if(str.charAt(i-1)=='z') {					
					if(str.charAt(i-2)=='d') {
						count--;
					}else {
						
					}					
				}				
			}else if(str.charAt(i)=='-') {				
				if(str.charAt(i-1)=='c' || str.charAt(i-1)=='d') {
					
				}else {				
					count++;
				}				
			}else if(str.charAt(i)=='j') {				
				if(str.charAt(i-1)=='l' || str.charAt(i-1)=='n') {
					
				}else {
					count++;
				}				
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}