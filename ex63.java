package examples;
public class ex63 {
	public static void main(String[] args) {
		// 순돌이 아빠가 도트프린터를 발명했다.
		// 3x3 이차원 정수 배열에 따라, 숫자를 찍는다고 한다.
		// 0 1 0  1 1 2 
		// 0 1 0  1 1 1 
		// 0 1 0  2 1 1   이차원배열에 값이 들어가 있으면, 
		//
		//   *    * * +     
		//   *    * * * 
		//   *    + * *  이렇게 출력값이 된다고 하자.
		// 0 1 2
		// 1 2 0
		// 2 1 0  으로 값이 들어가 있을 때 출력하시오.
		int[][]nums = new int[3][3];
		nums[0][0] = 0;
		nums[0][1] = 1;
		nums[0][2] = 2;

		nums[1][0] = 1;
		nums[1][1] = 2;
		nums[1][2] = 0;

		nums[2][0] = 2;
		nums[2][1] = 1;
		nums[2][2] = 0;
		
		for(int i = 0 ; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i][j]==0) {
					System.out.print(" ");
				}else if(nums[i][j]==1) {
					System.out.print("*");
				}else if(nums[i][j]==2) {
					System.out.print("+");
				}
			}System.out.println();
		}
	}
}