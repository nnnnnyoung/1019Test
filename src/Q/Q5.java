package Q;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 5
//		for문을 이용해 아래와 같이 1) 2) 3)을 출력하시오
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
