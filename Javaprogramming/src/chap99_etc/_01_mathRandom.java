package chap99_etc;

public class _01_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 ~ 0.99999999999999.... 까지의 랜덤 값 발생
		System.out.println(Math.random());
				
		//0 <= value < 1
		//0 <= value * 10 < 10
		//0 ~ 9.9999999.... 까지의 랜덤 값 생성
		System.out.println(Math.random() * 10);
		
		//int형으로 형변환 시 소수점 뒤의 값이 사라짐
		//0 <= value * 10 < 10 (정수로만)
		//0 ~ 9 까지의 랜덤 값 생성
		System.out.println((int)(Math.random() * 10));
		
		//1 ~ 10 까지의 랜덤 값 
		//0 + 1 <= value * 10 + 1 < 10 + 1(정수로만)
		//1 <= value * 10 + 1 < 11
		//1 ~ 10 까지의 랜덤 값 발생
		System.out.println((int)(Math.random() * 10) + 1);
		
		//1~ 45 까지의 랜덤 값
		System.out.println((int)(Math.random() * 45) + 1);
		
		

	}

}
