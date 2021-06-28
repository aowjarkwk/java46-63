package examples;

import java.util.Random;

public class ex51 {

	public static void main(String[] args) {
	Random rand = new Random();
	//연습문제1
	//철수가 주사위를 계속해서(무한히) 던진다.
	// 1~6의 눈금값에서
	// 6이 나올때까지 주사위를 계속 던지고,
	// 6이 나오면 정지하는 프로그램을 만드시오.
	//Random클래스 or Math클래스
	//출력값: 1 3 4 5 2 6 stop!
	while(true) {
		int a = rand.nextInt(6)+1;
		System.out.println(a);
		if(a == 6) {
			System.out.println("stop!");
			break;
		}
	}
	//연습문제2
	//철수가 주사위를 2개 던져서
	// 두 주사위의 값이 똑같을때까지 던진다고 할때
	// 주사위 값들을 출력하시오.
	//출력값: 1:2  3:4  5:6  5:5 stop!
	while(true) {
		int a = rand.nextInt(6)+1;
		int b = rand.nextInt(6)+1;
		System.out.println(a+" "+b);
		if(a==b) {
			System.out.println("stop!");
			break;
		}
	}
	}

}
