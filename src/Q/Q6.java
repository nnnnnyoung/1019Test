package Q;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 1620���� �ִ�. 
//		���� ū �ݾ��� ������ ���� �ִٰ� ������ ���� ������ ������ ����Ͻÿ�
		int money = 1620;
//		��� ����)
//		500�� 3��
//		100�� 1��
//		10�� 2��
		
		if(money>=500) {
			System.out.println("500�� "+money/500+"��");
		}
		if((money%500)>=100) {
			System.out.println("100�� "+(money%500)/100+"��");
		}
		if(money%100>=10) {
			System.out.println("10�� "+(money%100)/10+"��");
		} 
		if(money%10!=0) {
			System.out.println("1�� "+money%10+"��");
		}
	}

}
