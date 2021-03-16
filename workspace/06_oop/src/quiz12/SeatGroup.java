package quiz12;

import java.util.Scanner;

public class SeatGroup {

	private char seatType; // 'S', 'R', 'A', 'B'
	private int charge; // 요금
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}

	public SeatGroup(char seatType, int seatCount, int charge) {
		this.seatType = seatType;
		this.charge = charge;
		this.seats = new Seat[seatCount]; // 배열 생성. 아직 없는 상태
		// 배열에 실제 Seat 생성 작업
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new Seat(); // 빈 좌석 생성
		}
	}

}
