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
	}

}
//public int total(int[] numbers) {
//	int total = 0;
//	for(int num:numbers) {
//		total = total +num;
//	}
//	return total;