import java.util.Scanner;

public class BOJ1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// ��������
		// trim() vs strip() -> trim���� strip�� �� �������ϰ� ������ ����
		str = str.strip();
		// str�� �ܾ� ���̿� ������ ������ ���� ��� 1���� ������ �����ϰ� ����
		str = str.replaceAll("\\s+", " ");
		String[] array = str.split(" ");
		int count = 0;
		for(int i=0; i<array.length; i++) {
			count++;			
		}		
		// str�� ���� �ϳ��� �ԷµǾ��� ���
		if(array.length==1 && array[0]=="") {
			count = 0;
		}
		System.out.println(count);
	}
}