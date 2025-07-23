package ch06_4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal1 = new Calculator();
		int result = cal1.mul(20, 10);
		System.out.println(result);
		
		
//		System.out.println(cal1.totoal(new int[]));			

		
		int[] arr1 = {10,20,30};
		cal1.total(arr1);
		// 생성자 오버로딩
				Rectangle rec1 = new Rectangle(20, 10, "blue");
				Rectangle rec2 = new Rectangle(100, 200);
				Rectangle rec3 = new Rectangle();
				
				// 메소드 오버로딩
				int area1 = rec1.rectArea(); //200
				int area2 = rec1.rectArea(200); //2000
				int area3 = rec1.rectArea(30, 40); //1200
				
				System.out.println(area1);
				System.out.println(area2);
				System.out.println(area3);
	}

}
