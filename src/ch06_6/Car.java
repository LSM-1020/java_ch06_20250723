package ch06_6;

import ch06_6_1.AutoCar;

public class Car {
	public static void main(String[] args) {
		AutoCar autoCar = new AutoCar(); //다른 패키치 -> import문 반드시 필요!
		Tire tire = new Tire();//같은 패키지 -> public 없어도 사용 가능, private로 설정하면 사용x
		tire.tireName = "금호";
		tire.tireprint();
		tire.tirePrice = 10000;
		
	}
	
	
}
