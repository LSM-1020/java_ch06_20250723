package ch06_3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle abc = new Rectangle();
		//객체 선언은 생성자를 호출하는것
		abc.height = 10;
		abc.width = 20;
		int rectArea = abc.rectArea();
		
		System.out.println(rectArea);
	}

}
