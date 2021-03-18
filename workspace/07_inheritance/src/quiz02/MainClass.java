package quiz02;

public class MainClass {

	public static void main(String[] args) {

		SalaryMan staff1 = new SalaryMan("james", 300);
		// System.out.println(staff1.getName());
		// System.out.println(staff1.getPay());

		SalesMan staff2 = new SalesMan("alice", 100);
		staff2.setSalesAmount(2000);
		// System.out.println(staff2.getName());
		// System.out.println(staff2.getPay());

		Alba staff3 = new Alba("david");
		staff3.setPayPerHour(1);
		staff3.setTimes(200);
		// System.out.println(staff3.getName());
		// System.out.println(staff3.getPay());

		// 회사
		Company company = new Company(10);
		company.hireStaff(staff1);
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		company.staffInfo();

	}

}
