package examples;

public class ex54 {

	public static void main(String[] args) {
		//연습문제
		String str = "java programming is good!";
		
		//1. str문자열의 길이를 출력하시오.
		System.out.println(str.length());
		//2.good문자열을 perfect로 치환하시오.
		System.out.println(str.replaceAll("good", "perfect"));
		//3."programming" 문자열만 가져오기 substring
		System.out.println(str.substring(5,16));
		//4.i문자의 갯수를 출력하시오.
		int inum = 0;
		for(int i = 0; i<str.length(); i++) {
			char a = str.charAt(i);
			if (a=='i') {
				inum++;
			}
		}System.out.println(inum);
	
	}

}
