import java.util.Scanner;

public class BOJ2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// M�� ���� �����鼭 M�� ����� ī�� 3���� ��
		int result = sum(arr, N, M);
		System.out.println(result);	
	}
	
	public static int sum(int[] arr, int N, int M) {
		int result = 0;
		
		// ù��° ī��� N-2�� ���� �ʴ´�.
		for(int i=0; i<N-2; i++) {
			// �ι�° ī��� ù��° ī�庸�� ũ�� N-1�� ���� �ʴ´�.
			for(int j=i+1; j<N-1; j++) {
				// ����° ī��� �ι�° ī�庸�� ũ�� N�� ���� �ʴ´�.
				for(int k=j+1; k<N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					// ���� M�� ���� ���
					if(sum == M) {
						return sum;
					}
					// ���� ���� �պ��� ũ�� M���� ���� ���
					if(result<sum && sum<M) {
						result = sum;
					}
				}
			}
		}
		return result;
	}
}