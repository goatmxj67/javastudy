package quiz05;

public class Bunker {

	private Terran[] terrans;
	private int idx;

	public Bunker() {
		terrans = new Terran[10];
	}

	public void add(Bunkable terran) {
		if (idx < terrans.length) {
			terrans[idx++] = (Terran) terran;
		}
	}

}
