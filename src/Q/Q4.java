package Q;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] arr = {{41,55},{23,44}};
//		arr의 배열에 모든 수를 더하여 sum에 넣고 sum값을 출력하시오
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				sum=sum+arr[i][j];
			}
		}
		
		System.out.println(sum);
	}

}
