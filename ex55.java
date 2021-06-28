package examples;

public class ex55 {   
	                  //정수0      1         2
	public enum Hero { Ironman, Superman, Batman};
	public static void main(String[] args) {
		//열거형 enum
		
		//사용하는 이유
		//숫자로 값을 정의하기보다는 문자로 정의하기 위해서
		// 가위 0 -> sissors
		// 바위 1 -> rock
		// 보  2  -> paper
		System.out.println(Hero.Ironman);
		System.out.println(Hero.Superman);
		System.out.println(Hero.Batman);
		
		System.out.println(Hero.Ironman.ordinal()); //0
		System.out.println(Hero.Superman.ordinal());//1
		System.out.println(Hero.Batman.ordinal());//2
		
		//열거형 변수를 선언하자
		Hero myHero = Hero.Ironman; //변수선언
		System.out.println(myHero);
		myHero = Hero.Superman;  // 값 대입
		System.out.println(myHero);
		
		//숫자 비교보다 문자열로 비교하면 가독성이 좋아진다.
		switch(myHero) {
		case Ironman:
			System.out.println("아이언맨");
			break;
		case Superman:
			System.out.println("슈퍼맨");
			break;
		case Batman:
			System.out.println("베트맨");
			break;
		}
		if(myHero==Hero.Superman) {
			System.out.println("슈퍼맨");
		}
		
	}

}
