package Q;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 5
//		for���� �̿��� �Ʒ��� ���� 1) 2) 3)�� ����Ͻÿ�
//		1)
//		***
//		***
//		***
//		2)
//		*
//		**
//		***
//		3)
//		***
//		**
//		*
		
		for(int i=0; i<3; i++) {
			System.out.println("***");
		}
		
		System.out.println("--------");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		
		for(int i=0; i<3; i++) {
			for(int j=3; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
