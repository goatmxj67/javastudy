package quiz04;

//attack() : 10% 확률로 한 방에 KO 시킬 수 있습니다.

public class GlobalFighter extends Fighter {

	public GlobalFighter(String name) {
		super(name, (int) (Math.random() * 100) + 1, (int) (Math.random() * 10) + 1);
	}

	@Override
	public void attack(Fighter fighter) {
		// 나 : this
		// 상대편 : fighter
		if (Math.random() < 0.1) { // 10% 확률
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + "KO!");
		} else {
			// 내 power만큼 상대편 energy가 줄어듭니다.
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println(
					"공격: " + this.getName() + "[" + fighter.getName() + " 남은 에너지: " + fighter.getEnergy() + "]");
		}
	}

}
