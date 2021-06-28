package examples;

public class ex48 {

	public static void main(String[] args) {
		//do while 조건문 ==> while문과의 차이.
		//적어도 한번은 수행된다.
		//while문
		//초기화문
		//while(반복조건) {
		//	수행문
		//	증감문
		//}
		
		//do while문
		//초기화문
		//do {
		//	수행문
		//	증감문
		//} while(반복조건문) ;
		
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);

	}

}
