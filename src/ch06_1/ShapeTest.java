package ch06_1;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle tri1 = new Triangle(); // 메모리에 생성
		tri1.height = 20;
		tri1.width = 10;
		tri1.color = "red";
		
		double tri1area = tri1.traingleArea();
		System.out.println(tri1area);
		
		String tri1color = tri1.traingleColor(); // 메소드 호출
		
		
		Triangle tri2; //<-- 여기서는 메모리가 생성되지 않음
		tri2 = new Triangle(); // 인스턴스화-->new를 사용, 메모리에 객체(인스턴스)가 만들어짐
		
		
		
		
		
	}

}
