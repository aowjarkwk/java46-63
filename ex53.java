package examples;

public class ex53 {

	public static void main(String[] args) {
		// 문자열 메소드들
		// String 길이 알아오기
		String str = "This is my hero!";
		System.out.println("문자열의 길이:"+str.length());
		//문자열의 내용을 비교
		//타 언어에서는 == 사용
		//자바에서는 반드시 equals()함수 이용해야 됨.
		String str2 = "This is my papa!";
		System.out.println(str == str2); //서로 주소값을 비교함.X
		//equals를 통해 문자열비교
		System.out.println( str.equals(str2) ); 
		//영소문자로 변경 toLowerCase
		System.out.println(str.toLowerCase());
		//영대문자로 변경 toUpperCase
		System.out.println(str.toUpperCase());
		//문자열에서 문자 하나만 가져오기 charAt(int index)
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+"|");
		}
		//치환하기 replace
		System.out.println();
		System.out.println(str.replaceAll("hero", "mom"));
		//문자열의 일부만 가져오기 substring
		//            0123456789
		String str3 = "This is my hero!";
		System.out.println(str3.substring(3, 8));


	}

}
