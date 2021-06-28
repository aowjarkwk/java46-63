package examples;

import java.util.Random;

public class ex59 {

	public static void main(String[] args) {
		//난이도 중
		// 로또번호 1~45의 숫자중에 하나씩
		// 6번 뽑되
		// 중복된 수가 나오면 재추첨하도록 하시오.
		//정수배열에 추첨된 수를 넣고,
		//재추첨여부를 판별해야 됨.
		//힌트: 재추첨시 증감문을 하나 빼고 continue하면 됩니다.
		Random rand = new Random();
		int[]lotto = new int[6];
		for(int i = 0; i<lotto.length; i++) {
			lotto[i]=rand.nextInt(45)+1;
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					System.out.println("재추첨필요");
					i--;
					continue;
				}
			}System.out.println(lotto[i]);
		}

		
		
	}

}
