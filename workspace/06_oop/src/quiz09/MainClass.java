package quiz09;

public class MainClass {

	public static void main(String[] args) {
		Soldier soldier = new Soldier("람보", 3);

		soldier.addGun(new Gun("콜트", 6));
		soldier.addGun(new Gun("베레타", 6));
		soldier.addGun(new Gun("스미스웨슨", 6));

		soldier.shoot();
		soldier.shoot(1);
		soldier.shoot("베레타");

		soldier.info();

		soldier.reload(6);
		soldier.reload(1, 6);
		soldier.reload("베레타", 6);

		soldier.info();

	}

}
