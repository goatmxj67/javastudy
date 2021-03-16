package quiz03;

public class Singer {

	private String name;
	private Song song; // private Song[] songs;

	public Singer(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public Song getSong() {
		return song;
	}

	public void info() {
		// 김동률(취중진담, 4.5)
		System.out.println(name);
		song.info();
	}

}
