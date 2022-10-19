package Q;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		돈이 1620원이 있다. 
//		가장 큰 금액의 단위로 갖고 있다고 했을때 동전 단위와 개수를 출력하시오
		int money = 1620;
//		출력 예시)
//		500원 3개
//		100원 1개
//		10원 2개
		
		if(money>=500) {
			System.out.println("500원 "+money/500+"개");
		}
		if((money%500)>=100) {
			System.out.println("100원 "+(money%500)/100+"개");
		}
		if(money%100>=10) {
			System.out.println("10원 "+(money%100)/10+"개");
		} 
		if(money%10!=0) {
			System.out.println("1원 "+money%10+"개");
		}
	}

}
