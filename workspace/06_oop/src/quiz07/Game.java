package quiz07;

public class Game {

	private Player[] players;

	public Game(int playerCount) {
		players = new Player[playerCount];
	}

	public void setPlayers() {
		String[] names = { "alice", "david", "brown", "emily", "james" };
		for (int i = 0; i < players.length; i++) {
			// players[i].setName(name); // Player의 생성자가 없을 때
			players[i] = new Player(names[(int) (Math.random() * names.length)]);
		}

	}

	public void play() {
		// Player들의 play() 결과를 저장할 int[] times
		int[] times = new int[players.length];
		for (int i = 0; i < players.length; i++) {
			times[i] = players[i].play();
		}
		// times 배열에서 10과 가장 가까운 값 찾기
		// (times[i] - 10)의 절대값을 구한 뒤 그 중 가장 작은 값(최소값)을 구합니다.
		// 절대값 : Math.abs
		int min = Math.abs(times[0] - 10);
		int winnerNo = 0;
		for (int i = 0; i < times.length; i++) {
			if (Math.abs(times[i] - 10) < min) {
				min = Math.abs(times[i] - 10);
				winnerNo = i;
			}
		}
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].getName() + "'s result: " + times[i] + "second");
		}
		System.out.println(players[winnerNo].getName() + " win!!!");
	}

}
