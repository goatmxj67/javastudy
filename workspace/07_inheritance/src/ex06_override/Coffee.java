package ex06_override;

public class Coffee {

	private String bean;  // 원두
	
	public Coffee(String bean) {
		this.bean = bean;
	}
	
	public void taste() {
		System.out.println(bean + "원산지 원두는 맛이 없습니다.");
	}
	
}
