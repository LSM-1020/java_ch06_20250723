package ch06_1;

public class Triangle {
	
	//삼각형 추상화 -> 속성, 필드, 멤버변수
	int height;
	int width;
	String color;
	
	//메소드
	//삼각형 면적
	public double traingleArea() {
//		double area = height * width * 0.5;
//		return area; //메소드 1개당 return값은 1개만 가능
		return height * width * 0.5;
	}
	
	//삼각형 color 반환
	public String traingleColor() {
		System.out.println("삼각형의 색:" + color);
		return color;
	}
		
	
}

//1. 내가 객체를 만들기 위해 클래스에서 필요한 항목들을 설정함
//2. 메소드를 생성
//2-1. 반환되는 값이 있을때는 return을 넣어서 반환되도록 설정해야함, 없을대는 void로 애초에 지정하여 넣을필요 없음
//3. new를 이용하여 메모리에 생성
//4. 항목들에 값 설정
//5. double tri1area = tri1.traingleArea(); 처럼 정수int 실수double 문자 String으로 변수 지정
//6. 값을 출력하기위해 지정한 변수를 넣어서 출력
//7. class안에서 print문을 만들지 않았으면, 호출을 해서 지정