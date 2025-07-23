package ch06_3_exer;

public class car {
	
	String name;
	int maxspeed;
	
	Engine engine; // Engine클래스로 만든 객체를 필드로 선언할수있다

	public car(String name, int maxspeed, Engine engine) {//Engine은 Engine클래스에서 만든 객체를 넣어야함
		super();
		this.name = name;
		this.maxspeed = maxspeed;
		this.engine = engine;
	}
	
	public void carEngine() {
		System.out.println("엔진타입:" + engine.type);
		
	}

//1. 클래스를 두개 만드는데 포함시킬 객체를 매개변수로 지정한다
//2. 생성자를 만들어 포함시킨 매개변수를 넣어준다
//2-1. 부모는 car 자식은 Engine
//3. 메소드를 생성할때 자식인 Engine에서 생성한 객체를 사용할수있다.
//3-1. type이나 displacement 사용할수 있다는말
//4. main에서는 car와 Engine두가지 객체를 메모리에 생성한다
//5. carEngine()을 호출하면 System.out.println("엔진타입:" + engine.type);이 나옴
// engine.type은 Engine클래스에서 지정된값이다. engine은 Engine 클래스에서 지정한 임의값이고
// 그안에 type이 있음. 그값을 불러오는거임 displacement로 바꾸면 그값인 2를 불러옴

	public Engine outputEngine() { // engine을 생성하면 생성된 클래스 Engine으로 받아줘야함 
	engine.type="디젤";
	engine.displacement = 2;
	return engine;
}
	public String[] outputCars() { //배열을 String으로 받아주어 메소드 생성시에도 String
		String[] cars = {"소나타","아반떼"};
		return cars; //배열

}
}