package dao;

public class TestMainClass {

	public static void main(String[] args) {

		// 1. 객체(인스턴스) : private StaffDao() {} 때문에 객체 생성이 불가능하다.
		// 2. 클래스 : 클래스 메소드로 바꿔야 한다.

		// StaffDao 클래스의 getInstance()를 호출할 수 있도록
		// 추가 작업을 수행해 봅니다.

		@SuppressWarnings("unused")
		StaffDao dao = StaffDao.getInstance();

	}

}
