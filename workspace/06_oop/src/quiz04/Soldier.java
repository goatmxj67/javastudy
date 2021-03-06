package quiz04;

public class Soldier {

	private String name;
	private Gun gun;

	public Soldier(String name, Gun gun) {
		this.name = name;
		this.gun = gun;
	}

	public void shoot() {
		// 빵야! 1발 남았다.
		gun.shoot();
	}

	public void reload(int bullet) {
		// 2발이 장전되었다. 현재 2발.
		gun.reload(bullet);
	}

	public void info() {
		// 람보, K2에 6발 남았다.
		System.out.print(name + ", ");
		gun.info();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

}