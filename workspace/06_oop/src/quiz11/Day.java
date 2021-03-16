package quiz11;

public class Day {

	private String schedule;

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public void info() {
		if (schedule == null || schedule.isEmpty()) { // null 또는 빈 문자열("")
			System.out.println("[없음]");
		} else {
			System.out.println("[" + schedule + "]");
		}
	}

}
