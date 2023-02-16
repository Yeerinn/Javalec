package chap05_class.calc;

public class Calculator {
	private int num1;
	private int num2;
	private String op;
	
	public Calculator() {
		
	}
	
	public Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public int add() {
		return num1 + num2;
	}
	
	public int minus() {
		return num1 - num2;
		
	}
	
	public long multiple() {
		return num1 * num2;
	}
	
	public double divide() {
		return (double) num1 / num2;
	}
	
	public void calc() {
		//결과를 출력해주는 메소드
		switch(op) {
		case "+" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + add());
			break;
		case "-" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + minus());
			break;
		case "*" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + multiple());
			break;
		case "/" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + divide());
			break;
	}
		}
	
	
}
