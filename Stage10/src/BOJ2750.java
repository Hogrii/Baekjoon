import java.util.Scanner;

public class BOJ2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� ���� 
		int arr[] = new int[sc.nextInt()];
		// ������ ���ڵ�
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Bubble Sort�� �̿��� ����
		int tmp;
		// Bubble Sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
