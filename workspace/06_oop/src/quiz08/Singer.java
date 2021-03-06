package quiz08;

public class Singer {

	private Song[] songs;
	private int idx;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Song[] getSongs() {
		return songs;
	}

	public void setSongs(Song[] songs) {
		this.songs = songs;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public Singer(String name, int songCount) {
		this.name = name;
		this.songs = new Song[songCount]; // 최대 노래 개수
	}

	public void addSong(Song song) {
		if(idx < songs.length) {
			songs[idx++] = song; // 실제 현재 노래 개수
			// addSong() 호출마다 idx가 증가하므로, idx는 추가된 노래의 개수입니다.
		} else {
			System.out.println("더 이상 노래를 추가할 수 없습니다.");
		}
	}

	public void info() {
		// 가수명, 노래목록
		System.out.println("가수명: " + name);
		System.out.println("====== 노래 목록 ======");
		/*
		 * for (int i = 0; i < songs.length; i++) { if (songs[i] != null) {
		 * songs[i].info(); } }
		 */
		for (int i = 0; i < idx; i++) {
			songs[i].info();
		}
	}

}
