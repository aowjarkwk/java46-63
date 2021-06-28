package examples;

import java.util.Random;

public class ex52 {

	public static void main(String[] args) throws InterruptedException {
		//while문 무한루프 이용하는 문제.
		//야구게임을 만들어 보자
		//4번타자가 타석에 들어섰다.
		//투수가 공을 던질때, 랜덤하게 던진다. 
		//스트라이크을 던지면 숫자 0,
		//볼을 던지면 숫자 1로 처리한다.
		//볼카운트와 스트라이크 카운트를 출력한다.
		//볼카운트가 4개가 되면, "1루 진루!"라고 표시하고,
		//게임이 종료된다.
		//스트라이크가 3개가 되면, "삼진 아웃!"라고 표시하고,
		//게임이 종료된다.
		//공을 던지는 간격은 1초이다. sleep()
		Random rand = new Random();
		int strike=0;
		int ball=0;
		while(true) {
			int pitcher = rand.nextInt(2);
			
			if (pitcher ==0) {
				System.out.println("스트라이크!");
				strike++;
			}
			if(strike == 3) {
				System.out.println("삼진 아웃!");
				break;
			}
			if (pitcher == 1) {
				ball++;
				System.out.println("볼!");
			}
			if(ball == 4) {
				System.out.println("1루 진루!");
				break;
			}
			Thread.sleep(1000);
		}

	}

}
