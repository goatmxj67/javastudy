package dto;

import java.sql.Date;

import lombok.Data;

// DB Table에 저장된 행(Row)을 저장하는 클래스
// VO : Value Object
// DTO : Data Transfer Object

// 테이블 칼럼   클래스 필드
// BOARD_NO		 board_no 또는 boardNo
// BNO			 bNo 또는 bno 

// 디폴트 생성자 필수 : 생성자를 안 만들거나, 디폴트 생성자와 필드를 이용한 생성자를 모두 만듭니다.
// getter/setter 필수

@Data
public class StaffDto {

	private int no;
	private String name;
	private String department;
	private Date hireDate;
	
}
