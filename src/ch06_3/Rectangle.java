package ch06_3;

public class Rectangle {

	int width;
	int height;
	
	public Rectangle() { //기본 생성자 -> 반환 타입이 아예 없음, 이름이 해당 클래스의 이름으로 고정
	}
	
	public Rectangle(int width, int height) {
		
		
	}
	
	public int rectArea() { //사각형 면적 반환 메소드
		return width * height;
	}
	
}
