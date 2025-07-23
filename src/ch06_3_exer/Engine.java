package ch06_3_exer;

public class Engine {

	String type;
	int displacement; //배기량
	public Engine(String type, int displacement) {
		super();
		this.type = type;
		this.displacement = displacement;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void pintEngine() {
		System.out.println("엔진 타입: " + type);
	}
}
