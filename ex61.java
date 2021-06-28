package examples;

public class ex61 {

	public static void main(String[] args) {
		// 2차원 정수배열
		int[][] nums = {//1열 2열
					      {10,20},   //1행
					      {30,40}    //2행
				
		               };
		System.out.println(nums[0][0]); //1행1열
		System.out.println(nums[0][1]); //1행2열
		System.out.println(nums[1][0]); //2행1열
		System.out.println(nums[1][1]); //2행2열
		int[][]nums2 = new int[2][2];
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[1][0] = 300;
		nums2[1][1] = 400;
		System.out.println(nums2[0][0]); //1행1열
		System.out.println(nums2[0][1]); //1행2열
		System.out.println(nums2[1][0]); //2행1열
		System.out.println(nums2[1][1]); //2행2열
		
	}
	

}
