package Q;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���ڸ� �Է¹޾� �Է¹��� ������ �������� ����Ͻÿ�
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("������ ����� ����ұ��?");
		Q3_1 Q3=new Q3_1();
		int num=in.nextInt();
		in.nextLine();
		Q3.gugudan(num);

	}

}
