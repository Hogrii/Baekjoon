public class Ex02 {	
	// �����ѹ� �޼ҵ�
	public static int d(int i) {
		int sum = i;
		while(i != 0) {
			sum = sum + (i%10);
			i = i/10;
		}		
		return sum;
	}
	
	public static void main(String[] args) {		
		// �����ѹ��� �ƴ� ������ ����� �迭 ����
		boolean[] nonSelfNumber = new boolean[10001];
		
		// ���� ���� �Է�
		for(int i=1; i<10001; i++) {
			// Kaprekar�� �Լ�
			int nsn = d(i);
			// �����ڸ� �����ִ� ��
			if(nsn<10001) {
				// �����ѹ��� �ƴ� ������ true�� ����
				nonSelfNumber[nsn] = true;
			}
		}
		// ���ڿ��� ���������ִ� �޼ҵ�
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<10001; i++) {
			// �����ѹ�
			if(!nonSelfNumber[i]) {
				// �����ѹ� ��� �� ����
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);		
	}	
}