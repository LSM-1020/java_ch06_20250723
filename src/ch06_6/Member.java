package ch06_6;

public class Member {
	private String name; //회원 이름
	private String id; //회원 id
	private String pw; //회원 비밀번호
	private int age; //회원 나이
	
	
	
	public Member(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//setter
	public void setId(String id) { //setter 메소드
		this.id = id;
	}
	public void setAge(int age) { //setter 메소드
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}


	//getter
	public String getName() {
		return this.name;
	}
	
}
//필드에서 바로 가져다 쓸수없어 메소드에서 같은 복제품을 택갈이해서 쓸수있도록 해줄께
//데이터 형식은 매개변수를 지정했으니 거기에 맞게써
//id나 age나 지정해주는건 main을 설정하는것

//getter는 설정후 값을 불러주기 위한것