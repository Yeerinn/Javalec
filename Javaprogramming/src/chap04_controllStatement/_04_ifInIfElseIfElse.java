package chap04_controllStatement;

public class _04_ifInIfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Score = 90;
		//95점 이상 A+ 
		//95점 미만 A0
		if(Score >= 95)
			System.out.println("A+학점 입니다.");
		else if(Score < 95 && Score >= 90)
			System.out.println("A0학점 입니다.");
		//85점 이상 B+
		//85점 미만 B0
		else if(Score >= 85 )
			System.out.println("B+학점 입니다.");
		else if(Score < 80 && Score >= 80)
			System.out.println("B0학점 입니다.");
		//75점 이상 C+
		//75점 미만 C0
		else if(Score >= 75)
			System.out.println("C+학점 입니다.");
		else if(Score < 70 && Score >= 70)
			System.out.println("C0학점 입니다.");
		//65점 이상 D+
		//65점 미만 D0
		else if (Score >= 65)
			System.out.println("D+학점 입니다.");
		else if(Score < 65)
			System.out.println("D0학점 입니다.");
		
		
		
		
		
		
		
		
		
		

	}

}
