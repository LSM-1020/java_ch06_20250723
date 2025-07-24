package ch06_6;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member();
		member1.setName("김철수");
//		member1.id = "tiger"; -> 필드인 id가 private에 걸려서 값을 넣을수 없다
		member1.setId("tiger"); // 필드에서 바로 접근이 아닌, 메소드를 거쳐서 접근되도록함
		member1.setPw("12345");
//		member1.age = 21;
		member1.setAge(20);
		
		System.out.println(member1.getName());
		
//		Member member2 = new Member("이순신","dog","123",30);
	
		
		
	}
	

}
//setter는 필드에서 직접 대입되지 않고 메소드를 통해서만 접근되도록 하는것
