package ch06_3_exer;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine engine = new Engine("가솔린", 2);
		car car = new car("소나타", 200, engine); //car에서 객체 생성할때 Engine에서먼저 지정해줘야 engine사용 가능
		
		car.carEngine();
		
	}

}
