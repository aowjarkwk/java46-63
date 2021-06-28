package examples;

public class ex47 {

	public static void main(String[] args) {
		// 연습문제
		//1. 아래 for문을 while문으로 바꾸어 동일하게 출력하시오.
		for( int i=10; i<=15; i++ ) {
			if( i%2==0 ) {
				System.out.println(i);
			}
		}
		int i=10;
		while(i<=15) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println();
		//2. 아래의  while문을 for문으로 바꾸어 동일하게 출력
		int j=20;
		while( j>10 ) {
			System.out.println( j );
			j--;
			
		for(int k=20; k>10; k--) {
			System.out.println(k);
		}
		}
	}

}
