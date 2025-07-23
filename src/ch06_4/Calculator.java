package ch06_4;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public int total(int[] numbers) {
		int total = 0;
		for(int num:numbers) {
			total = total +num;
		}
		return total;
	}
	//매개변수가 몇개인지모르면 아예 매개변수를 지정하여 main에서 설정
	
	
	
	
	
	
	
	
	
	
	
	
	
}
