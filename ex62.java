package examples;

import java.util.Random;

public class ex62 {

	public static void main(String[] args) {
		//연습문제
		// 이차원 정수형 배열을 행은 3개, 열은 3개로 만들어서,
		// 임의의 정수(1~100)를 Math.random()으로 넣어서 출력하시오.
		Random rand = new Random();
		//nums.length 행의길이
		//nums[].length 열의길이
		int[][]nums = new int[3][3];
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				nums[i][j] = rand.nextInt(100)+1;
			}
		}
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				System.out.println(nums[i][j]);
			}
		}

	}

}
