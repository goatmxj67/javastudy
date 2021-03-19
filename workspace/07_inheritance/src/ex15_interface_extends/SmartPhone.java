package ex15_interface_extends;

// Computable의 playApp()을 반드시 오버라이드 해야 합니다.

public class SmartPhone extends Phone implements Computable {

	@Override
	public void playApp() {
		System.out.println("앱을 실행한다.");
	}

}
