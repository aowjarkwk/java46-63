package examples;

public class ex50 {

	public static void main(String[] args) {
		// 무한루프 : infinite loop
		
		//무한루프 정비방법:1.정지버튼(빨간네모)
		//                  2. 이클립스 재시동
		
		//무한루프 만드는 방법
		//for
//		for(; ;) {
//			System.out.println("무한루프");
//		}
		
		//while
//		while(true) {
//			System.out.println("무한루프");
//		}
//	
		//탈출조건
		int count = 0;
		while(true) {
			System.out.println( count++ );
			if(count > 10) {
				break;
			}
		}
	}

}
