package examples;

import java.util.Random;

public class ex58 {

	public static void main(String[] args) {
		//연습문제
		// 1
		// 정수형배열 nums를 선언하고,
		// 정수 10개를 담을 만큼 크기를 선정하고, 배열선언방법 2 : new사용
		// 10,20,30...100을 넣고
		// 출력하시오.

		int[]nums = new int[10];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		nums[5]=60;
		nums[6]=70;
		nums[7]=80;
		nums[8]=90;
		nums[9]=100;
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println();
		// 2. 
		// 정수형데이타 6개를 담는 배열 lotto를 선언하고,
		// 그 수에 랜덤값 1~45를 넣고, 출력하세요.
		int[]lotto = new int[6];
		Random rand = new Random();
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=rand.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
	}

}
