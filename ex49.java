package examples;

public class ex49 {

	public static void main(String[] args) {
		// 연습문제
		// while문을 이용하여,
		//1. 1부터 100사이의 7의 배수만 출력하시오.
		int i=1;
		while(i<=100) {
			if(i%7==0) {
				System.out.println(i);
			}
			i++;
			
		}
		//2. 1부터 100까지의 합을 출력하세요. 
		
		i=1;
		int result=0;
		while(i<=100) {
			result=result+i;
			i++;
		}System.out.println(result);
		//난이도 중
		//3. 1부터 100까지의 소수가 몇개인지 출력하시오.
		//   1과 자신으로만 나눠지는 수 : 소수
		i=1;
		int j=1;
		int count = 0;
		while(i<=100) {
			
			j=0;
			i++;
			while(j<i) {
				j++;
				if(i%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println(i);
			}
			count=0;
		}

}
}
