package Q;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1���� 20���� �����߿��� 2�Ǵ� 3�� ����� �ƴ� ������ ������ ���Ͻÿ�
		
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i%2!=0&&i%3!=0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
