package ch06_4;

public class MemberService {
	
		public boolean login(String id, String password) {
			if(id.equals("hong") && password.equals("12345")) {
				return true;
			}else {
				return false;
			}
		}
		
		public void logout(String id) {
			System.out.println("로그아웃 되었습니다.");
		}
}
// boolean 의 return문 , if로 조건 세울수 있다