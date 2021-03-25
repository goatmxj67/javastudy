package main;

import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	private int no;

	public void menu() {
		System.out.println("=====사원관리프로그램=====");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 조회");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("==========================");
	}

	public void execute() {
		menu();
		while (true) {
			System.out.print("선택(1~6) >>>");
			switch (sc.nextInt()) {
			case 1:
				insertStaff();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 선택하세요.");
			}
		}
	}

	public void insertStaff() {
		no++;
		System.out.print("사원 이름 >> ");
		String name = sc.next();
		System.out.print("부서 이름 >> ");
		String department = sc.next();
		StaffDto staffDto = new StaffDto();
		staffDto.setNo(no);
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto); // DB에 삽입
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}

}
