package examples;
public class ex60 {
	public static void main(String[] args) {
		// 아래의 배열을 내림차순으로 정렬하시오.
		// 올림차순으로도 정렬해보세요.
		// 2중 for문 이용하여 비교/치환을 통해
		// 자기보다 작은 수가 있으면 자리바꿈.
		int[] numbers = { 12, 31, 48, 82, 29 };
		
		for(int i = 0; i<numbers.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if (numbers[i]<numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}else {
					continue;
				}
			}
		}
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}