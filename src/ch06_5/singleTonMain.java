package ch06_5;

public class singleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		singleTonTest single1 = new singleTonTest();
//		single1.getInstance();
		
		singleTonTest single1 = singleTonTest.getInstance(); //return singleTonTest객체를 반환
		//객체를 만들려면 public으로 풀어논 메소드바께 호출이 안됨, 호출하면 객체 sigle을 반환시켜줌 그 single이 내부class 객체
	
		singleTonTest single2 = singleTonTest.getInstance();
		
		if (single1 == single2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		final int scr = 400; // final = 상수 400으로 고정 다른 수 설정X
	}

}
//내부 class에서는 private singleTonTest()로 내부에서만 쓸수있도록 만듬, 
//외부class에서 메소드 가지고오면 new singleTonTest(); 에러 발생
//외부class에서 내부class의 static을 통하여 메소드 불러들어 객체 생성 가능