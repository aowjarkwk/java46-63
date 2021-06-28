package examples;
import java.util.Arrays;
import java.util.Random;
public class ex59답 {
	public static void main(String[] args) {
		//난이도 중
		// 로또번호 1~45의 숫자중에 하나씩
		// 6번 뽑되
		// 중복된 수가 나오면 재추첨하도록 하시오.
		//힌트:
		// 정수배열에 추첨된 수를 넣고,
		// 재추첨여부를 판별해야 됨.
		// *재추첨시 증감문을 i-- 하나 빼고 continue하면 됩니다.
		int[] lotto = new int[6];
		Random rand = new Random();
		for( int i=0; i<6; i++) {
			lotto[i] = rand.nextInt( 45 ) + 1;
			System.out.println( lotto[i] );
			for( int j=0; j<i; j++ ) {
				if( lotto[j] == lotto[i] ) {
					System.out.println("재추첨");
					//재추첨
					i--;
					continue;
				}
			}
		}
		//오름차순 정렬
		Arrays.sort(lotto);
		System.out.println();
		//향상된 for문 - js의 for of문
		for( int num : lotto ) {
			System.out.println( num );
		}
	}
}