package ch06_4;

public class Rectangle {
	
	int width;
	int height;
	String color;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		
	}
	public int rectArea() { //메소드1
		return width * height;
	}
	public int rectArea(int width, int height) { //메소드2
		return width * height;
	}
	public int rectArea(int width) { // 메소드3
		return width * this.height; //매개변수 지정안해서 위 객체로 this를 앞에 적어줌
	}	
}
//클래스 내에서 같은 이름의 메소드를 쓸수없지만 매개변수를 다르게하면 생성가능 = 메소드 오버로딩