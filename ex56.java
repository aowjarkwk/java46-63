package examples;

public class ex56 {

	public static void main(String[] args) {
		// 배열
		// 같은 타입의 데이터를 연속된 공간에 나열시키고,
		// 각 데이터에 인덱스(index)를 부여해 놓은 자료구조이다
		//자바스크립트
		//var arr1 = [0,1,2,3,4];
		//var arr2 = new Array(5);
		
		//정수형 배열 - C언어스타일
		//타입 배열이름   {  요소들 };
		int[] arrayNums1 = { 0, 1, 2, 3, 4 };
		System.out.println( arrayNums1[0] );
		System.out.println( arrayNums1[1] );
		System.out.println( arrayNums1[2] );
		System.out.println( arrayNums1[3] );
		System.out.println( arrayNums1[4] );
		//정수형 배열 - 공간만 5개 확보
		int[] arrayNums2 = new int[5];
		arrayNums2[0] = 0;
		arrayNums2[1] = 1;
		arrayNums2[2] = 2;
		arrayNums2[3] = 3;
		arrayNums2[4] = 4;
		System.out.println( arrayNums2[0] );
		System.out.println( arrayNums2[1] );
		System.out.println( arrayNums2[2] );
		System.out.println( arrayNums2[3] );
		System.out.println( arrayNums2[4] );
		

	}

}
