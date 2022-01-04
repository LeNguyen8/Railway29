package entity;

import java.time.LocalDate;
import java.util.Scanner;

import entity.Position.PositionName;

public class TestingSystem1 {
	Department dp1, dp2, dp3;
	Department[] listDepartments = new Department[3];

	Account acc1, acc2, acc3, acc4;
	Account[] listAccounts = new Account[4];

	Position ps1, ps2, ps3, ps4;
	Group gp1, gp2, gp3;

	public TestingSystem1() {
		dp1 = new Department(1, "Phong Dev");
		dp2 = new Department(2, "Phong Marketing");
		dp3 = new Department(3, "Phong Sale");

		listDepartments[0] = dp1;
		listDepartments[1] = dp2;
		listDepartments[2] = dp3;

		// Tao ra 3 position
		ps1 = new Position(1, PositionName.Dev);
		ps2 = new Position();
		ps2.setId(2);
		ps2.setName(PositionName.Test);
		ps3 = new Position(3, PositionName.Scrum_Master);
		ps4 = new Position(4, PositionName.PM);

		// Tao ra 3 group
		gp1 = new Group(1, "Nhóm 1");
		gp2 = new Group(2, "Nhóm 2");
		gp3 = new Group(3, "Nhóm 3");

		// Tao ra 3 account
		acc1 = new Account();
		acc1.id = 1;
		acc1.email = "haitran1@gmail.com";
		acc1.userName = "haitran";
		acc1.fullName = "Tran Thanh Hai";
		acc1.department = dp1;
		acc1.position = ps1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { gp1, gp2 };
		acc1.groups = groupAcc1;

		acc2 = new Account();
		acc2.id = 2;
		acc2.email = "huynguyen2@gmail.com";
		acc2.userName = "huynguyen";
		acc2.fullName = "Nguyen Xuan Huy";
		acc2.department = dp2;
		acc2.position = ps2;
		acc2.createDate = LocalDate.of(2021, 12, 27);
		Group[] groupAcc2 = { gp2, gp3 };
		acc2.groups = groupAcc2;

		acc3 = new Account();
		acc3.id = 3;
		acc3.email = "sondo3@gmail.com";
		acc3.userName = "sondo";
		acc3.fullName = "Do Minh Son";
		acc3.department = dp3;
		acc3.position = ps3;
		acc3.createDate = LocalDate.now();
		Group[] groupAcc3 = { gp3, gp1 };
		acc3.groups = groupAcc3;

		Group[] groupAcc4 = { gp1, gp2 };
		acc4 = new Account(4, "phatnguyen4@gmail.com", "phatnguyen", "Nguyen Tan Phat", dp1, ps1, LocalDate.now(),
				groupAcc4);

		listAccounts[0] = acc1;
		listAccounts[1] = acc2;
		listAccounts[2] = acc3;
		listAccounts[3] = acc4;
	}

	/*
	 * Question 1 Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
	 * == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
	 * in ra text "Phòng ban của nhân viên này là ..."
	 */
	public void q1() {
		System.out.println("Question 1: Kiem tra account thu 2:");
		if (acc2.department == null)
			System.out.println("Nhân viên này chưa có phòng ban");
		else
			System.out.println("Phòng ban của nhân viên này là " + acc2.department.name);

	}

	/*
	 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
	 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
	 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
	 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
	 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
	 * người hóng chuyện, tham gia tất cả các group"
	 * 
	 */
	public void q2() {
		System.out.println("Question 2: Kiem tra account thu 2:");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (acc2.groups.length == 1 || acc2.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (acc2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (acc2.groups.length >= 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

	}

	// Question 3: Sử dụng toán tử ternary để làm Question 1
	public void q3() {
		System.out.println("Question 3: Kiem tra account thu 2 bằng toán tử ternary:");
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + acc2.department.name);

	}

	/*
	 * Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của
	 * account thứ 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không
	 * phải thì in ra text "Người này không phải là Developer"
	 */
	public void q4() {
		System.out.println("Question 4: Kiểm tra position của account thứ 1");
		System.out.println(
				"Dev".equals(acc1.position.getName()) ? "Đây là Developer" : "Người này không phải là Developer");
	}

	/*
	 * Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format
	 * sau: Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" Nếu số lượng
	 * account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng account = 3 thì
	 * in ra "Nhóm có ba thành viên" Còn lại in ra "Nhóm có nhiều thành viên"
	 */
	public void q5() {
		System.out.println("Question 5:");
		if (gp1.accounts == null) {
			System.out.println("Group chưa có thành viên nào tham gia");
		} else
			switch (gp1.accounts.length) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
	}

	// Question 6: Sử dụng switch case để làm lại Question 2
	public void q6() {
		System.out.println("Question 6:");
		System.out.println("Kiem tra account thu 2:");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else
			switch (acc2.groups.length) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
	}

	// Question 7: Sử dụng switch case để làm lại Question 4
	public void q7() {
		System.out.println("Question 7:");
		switch (acc1.position.name.toString()) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
	}

	// Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng
	// ban của họ
	public void q8() {
		System.out.println("Question 8:");

		Account[] accArray = { acc1, acc2, acc3 };
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " +

					account.email + " Name: " + account.fullName);
		}
	}

	// Question 9: In ra thông tin các phòng ban bao gồm: id và name
	public void q9() {
		System.out.println("Question 9:");

		Department[] dpArray = { dp1, dp2, dp3 };
		for (Department department : dpArray) {
			System.out.println("DepartmentID: " + department.id + " DepartmentName: " + department.name);
		}
	}

	/*
	 * Question 10: In ra thông tin các account bao gồm: Email, FullName và tên
	 * phòng ban của họ theo định dạng như sau: Thông tin account thứ 1 là: Email:
	 * NguyenVanA@gmail.com Full name: Nguyễn Văn A Phòng ban: Sale Thông tin
	 * account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn B Phòng
	 * ban: Marketting
	 */
	public void q10() {
		System.out.println("Question 10:");

		Account[] accArray1 = { acc1, acc2, acc3 };
		for (int i = 0; i < accArray1.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");

			System.out.println("Email: " + accArray1[i].email);
			System.out.println("Full name: " + accArray1[i].fullName);
			System.out.println("Phòng ban: " + accArray1[i].department.name);
		}
	}

	/*
	 * Question 11: In ra thông tin các phòng ban bao gồm: id và name theo định dạng
	 * sau: Thông tin department thứ 1 là: Id: 1 Name: Sale Thông tin department thứ
	 * 2 là: Id: 2 Name: Marketing
	 */
	public void q11() {
		System.out.println("Question 11");

		Account[] accArray2 = { acc1, acc2, acc3 };
		for (int i = 0; i < accArray2.length; i++) {
			System.out.println("Id: " + accArray2[i].id);
			System.out.println("Name: " + accArray2[i].department.name);
		}
	}

	/*
	 * Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
	 */
	public void q15() {
		System.out.println("Question 15:");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Số chẵn: " + i);
			}
		}
	}

	/*
	 * Question 16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp
	 * với lệnh break, continue
	 * 
	 */
	public void q16() {
		System.out.println("In ra thông tin các account bằng while");
		Account[] accArray3 = { acc1, acc2, acc3 };
		int i = 0;
		while (i < accArray3.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accArray3[i].email);
			System.out.println("Fullname: " + accArray3[i].fullName);
			System.out.println("Phòng ban: " + accArray3[i].department.name);
			i++;
		}
	}

	/*
	 * Exercise 2 (Optional): System out printf Question 1: Khai báo 1 số nguyên = 5
	 * và sử dụng lệnh System out printf để in ra số nguyên đó
	 */
	public void q17() {

		int a = 5;
		System.out.printf("%d", a);
	}

	/*
	 * Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
	 * printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
	 */

	// Exercise 5: Input from console
	/*
	 * Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
	 * 
	 */
	public void q51() {
		System.out.println("Nhập vào số nguyên thứ 1");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Nhập vào số nguyên thứ 2");
		int b = sc.nextInt();
		System.out.println("Nhập vào số nguyên thứ 3");
		int c = sc.nextInt();
		sc.close();
	}

	/*
	 * Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
	 */
	public void q52() {
		System.out.println("Nhập vào số thực thứ 1");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Nhập vào số thực thứ 2");
		double b = sc.nextDouble();
	}

	/*
	 * Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
	 */
	public void q53() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào năm sinh: ");
		int year = sc.nextInt();
		System.out.println("Mời bạn nhập vào tháng sinh: ");
		int month = sc.nextInt();
		System.out.println("Mời bạn nhập vào ngày sinh: ");
		int day = sc.nextInt();
		LocalDate dateBirth = LocalDate.of(year, month, day);
		System.out.println("Ngày sinh của bạn là: " + dateBirth);
	}

	/*
	 * Question 5: Viết lệnh cho phép người dùng tạo account (viết thành method) Đối
	 * với property Position, Người dùng nhập vào 1 2 3 4 5 và vào chương trình sẽ
	 * chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM
	 */
	public void q55() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào account");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.id = sc.nextInt();
		System.out.println("Nhập userName");
		acc.userName = sc.next();
		System.out.println("Nhập fullName");
		acc.fullName = sc.next();
		System.out.println("Nhập position (Nhập các số 1 => 4 tương ứng: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM)");
		int psName = sc.nextInt();
		switch (psName) {
		case 1:
			Position ps = new Position();
			ps.name = PositionName.Dev;
			acc.position = ps;
			break;
		case 2:
			Position ps1 = new Position();
			ps1.name = PositionName.Test;
			acc.position = ps1;
			break;
		case 3:
			Position ps2 = new Position();
			ps2.name = PositionName.Scrum_Master;
			acc.position = ps2;
			break;
		case 4:
			Position ps3 = new Position();
			ps3.name = PositionName.PM;
			acc.position = ps3;
			break;
		}
		System.out.println("Thông tin Acc vừa nhập, ID: " + acc.id + " UserName: " + acc.userName + " FullName: "
				+ acc.fullName + " Position: " + acc.position.name);
	}

	/*
	 * Question 6: Viết lệnh cho phép người dùng tạo department (viết thành method)
	 */
	public void q56() {
		Scanner sc = new Scanner(System.in);
		Department dp = new Department();
		System.out.println("Nhập vào Id:");
		dp.id = sc.nextInt();
		System.out.println("Nhập vào tên phòng ban:");
		dp.name = sc.next();
		System.out.println("Thông tin Department vừa nhập là: Id: " + dp.id + " Tên phòng ban: " + dp.name);
	}

	/*
	 * Question 7: Nhập số chẵn từ console
	 */
	public void q57() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số chắn");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Số chẵn vừa nhập vào là: " + a);
		} else {
			System.out.println("Mời nhập lại số CHẮN");
		}	
	}
	

	/*
	 * Viết chương trình thực hiện theo flow sau: Bước 1: Chương trình in ra text
	 * "mời bạn nhập vào chức năng muốn sử dụng" Bước 2: Nếu người dùng nhập vào 1
	 * thì sẽ thực hiện tạo account Nếu người dùng nhập vào 2 thì sẽ thực hiện chức
	 * năng tạo department Nếu người dùng nhập vào số khác thì in ra text "Mời bạn
	 * nhập lại" và quay trở lại bước 1
	 * 
	 */
	public void q58() {
		Scanner sc = new Scanner(System.in);
		int choose;
		while (true) {
			System.out.println("Mời bạn chọn chức năng: 1. Tạo Account, 2. Tạo Department");
			choose = sc.nextInt();
			if (choose == 1 || choose == 2) {
				switch (choose) {
				case 1:
					System.out.println("Mời bạn nhập vào account");
					Account acc = new Account();
					System.out.println("Nhập ID: ");
					acc.id = sc.nextInt();
					System.out.println("Nhập userName");
					acc.userName = sc.next();
					System.out.println("Nhập fullName");
					acc.fullName = sc.next();
					System.out.println(
							"Nhập position (Nhập các số 1 => 4 tương ứng: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM)");
					int psName = sc.nextInt();
					switch (psName) {
					case 1:
						Position ps = new Position();
						ps.name = PositionName.Dev;
						acc.position = ps;
						break;
					case 2:
						Position ps1 = new Position();
						ps1.name = PositionName.Test;
						acc.position = ps1;
						break;
					case 3:
						Position ps2 = new Position();
						ps2.name = PositionName.Scrum_Master;
						acc.position = ps2;
						break;
					case 4:
						Position ps3 = new Position();
						ps3.name = PositionName.PM;
						acc.position = ps3;
						break;
					}
					System.out.println("Thông tin Acc vừa nhập, ID: " + acc.id + " UserName: " + acc.userName
							+ " FullName: " + acc.fullName + " Position: " + acc.position.name);
					break;
				case 2:
					Department dp = new Department();
					System.out.println("Nhập vào Id:");
					dp.id = sc.nextInt();
					System.out.println("Nhập vào tên phòng ban:");
					dp.name = sc.next();
					System.out.println("Thông tin Department vừa nhập là: Id: " + dp.id + " Tên phòng ban: " + dp.name);
					break;
				}
				return;
			} else {
				System.out.println("Nhập lại: ");
			}
		}

	}

	/*
	 * Exercise 6 (Optional): Method Question 1: Tạo method để in ra các số chẵn
	 * nguyên dương nhỏ hơn 10
	 */
	public void q61() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("i = " + i);
			}
		}
	}
}
