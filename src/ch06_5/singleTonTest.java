package ch06_5;

public class singleTonTest { //메모리에 반드시 하나만 존재해야하는 인스턴스를 만들어주는 클래스
	//자체적으로 만든 객체,정적필드
	private static singleTonTest single = new singleTonTest();

	//생성자
	private singleTonTest() {
		
	}
	
	//메소드
	public static singleTonTest getInstance() {
		return single;
	}
}
