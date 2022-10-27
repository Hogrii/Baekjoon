import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ11650 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		// ��ǥ�� ��
		int N = Integer.parseInt(br.readLine());
		// ��ǥ �迭
		int arr[][] = new int[N][2];
		
		// ��ǥ �Է�
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
	
		// ���� -> e1, e2�� ���� arr�� �����Ѵ�.
		Arrays.sort(arr, (e1, e2) -> { // (e1, e2)�� Comparator Class�� compare �޼ҵ�
			if(e1[0] == e2[0]) { // ù��° ��ǥ�� ���ٸ�
				return e1[1] - e2[1]; // �ι�° ��ǥ�� �� -> ����, 0, ���
			}else { // ù��° ��ǥ�� ���� �ʴٸ�
				return e1[0] - e2[0]; // ù��° ��ǥ�� �� -> ����, 0, ���
			}
		});
		
//		�� Arrays.sort(arr, (e1, e2) -> {} �� ����.
//		Arrays.sort(arr, new Comparator<int[]>() {
//			public int compare(int[] e1, int[] e2) {
//				if(e1[0] == e2[0]) {
//					return e1[1]-e2[1];
//				}else {
//					return e1[0]-e2[0];
//				}
//			}
//		});
		
//		���� ����
//		int tmp;
//		for(int i=0; i<N-1; i++) {
//		 	for(int j=i+1; j<N; j++) {
//		 		if(arr[i][0]>arr[j][0]) {
//		 			for(int k=0; k<2; k++) {						
//		 				tmp = arr[i][k];
//		 				arr[i][k] = arr[j][k];
//		 				arr[j][k] = tmp;
//		 			}
//		 		}else if(arr[i][0]==arr[j][0]) {
//		 			if(arr[i][1]>arr[j][1]) {						
//		 				tmp = arr[i][1];
//		 				arr[i][1] = arr[j][1];
//		 				arr[j][1] = tmp;
//		 			}
//		 		}
//			}
//		}
		
		// ���
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}		
		System.out.println(sb);
	}
}