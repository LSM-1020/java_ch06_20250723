package ch06_3_exer;

public class circle {

	int radius ; //반지름
	double PI = 3.14; //파이값
	
	public circle() { //기본 생성자
		super();
		// TODO Auto-generated constructor stub
	}

	public circle(int radius) { // 매개변수 생성자
		super();
		this.radius = radius;
		 //초기값이 이미 들어가있기때문에 this쓰지않음 처음에 값을 지정해줬기 때문에 PI값 필요없음
	}
	//입력된 반지름을 가진 원의 면적을 반환하는 메소드 circleArea
	
	public double circleArea() { // 사용자가 임의로 설정
		return radius*radius*PI;
	}
	
}
