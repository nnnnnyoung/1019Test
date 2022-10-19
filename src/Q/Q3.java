package Q;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		숫자를 입력받아 입력받은 숫자의 구구단을 출력하시오
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("구구단 몇단을 출력할까요?");
		Q3_1 Q3=new Q3_1();
		int num=in.nextInt();
		in.nextLine();
		Q3.gugudan(num);

	}

}
