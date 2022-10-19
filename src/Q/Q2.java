package Q;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1부터 20까지 정수중에서 2또는 3의 배수가 아닌 수들의 총합을 구하시오
		
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i%2!=0&&i%3!=0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
