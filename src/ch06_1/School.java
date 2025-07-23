package ch06_1;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student(); //메모리에 stu1이라는 객체가 생성됨
		stu1.name = "홍길동";
		stu1.hakbun = "20250722";
		stu1.age = 22;
		stu1.phone = "010-1234-5678";
		stu1.address = "서울시 종로구";
		stu1.schoolname = "중정고등학교";
		
		stu1.outputName();
		
		Student stu2 = new Student(); //메모리에 stu2라는 다른 객체를 생성하여 다른 정보 넣을수 있음
		stu2.name = "김철수";
		stu2.hakbun = "20251231";
		stu2.age = 21;
		stu2.phone = "010-1111-2222";
		stu2.address = "서울시 강남구";
		stu2.outputName();
		
	}

}
