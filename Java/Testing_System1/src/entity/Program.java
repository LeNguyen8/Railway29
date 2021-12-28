package entity;

import java.time.LocalDate;

import entity.Position.PositionName;

public class Program {

	public static void main(String[] args) {
		// Tao ra 3 deparment
		Department dp1 = new Department();
		dp1.id = 1;
		dp1.name = "Phong Admin";

		Department dp2 = new Department();
		dp2.id = 2;
		dp2.name = "Phong Sales";

		Department dp3 = new Department();
		dp3.id = 3;
		dp3.name = "Phong CS";

		// Tao ra 3 position
		Position ps1 = new Position();
		ps1.id = 1;
		ps1.name = PositionName.Dev;

		Position ps2 = new Position();
		ps2.id = 2;
		ps2.name = PositionName.Test;

		Position ps3 = new Position();
		ps3.id = 3;
		ps3.name = PositionName.Scrum_Master;

		// Tao ra 3 group
		Group gp1 = new Group();
		gp1.id = 1;
		gp1.name = "Nhom 1";

		Group gp2 = new Group();
		gp2.id = 2;
		gp2.name = "Nhom 2";

		Group gp3 = new Group();
		gp3.id = 3;
		gp3.name = "Nhom 3";

		// Tao ra 3 account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "haitran1@gmail.com";
		acc1.userName = "haitran";
		acc1.fullName = "Tran Thanh Hai";
		acc1.department = dp1;
		acc1.position = ps1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { gp1, gp2 };
		acc1.groups = groupAcc1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "huynguyen2@gmail.com";
		acc2.userName = "huynguyen";
		acc2.fullName = "Nguyen Xuan Huy";
		acc2.department = dp2;
		acc2.position = ps2;
		acc2.createDate = LocalDate.of(2021, 12, 27);
		Group[] groupAcc2 = { gp2, gp3 };
		acc2.groups = groupAcc2;

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "sondo3@gmail.com";
		acc3.userName = "sondo";
		acc3.fullName = "Do Minh Son";
		acc3.department = dp3;
		acc3.position = ps3;
		acc3.createDate = LocalDate.now();
		Group[] groupAcc3 = { gp3, gp1 };
		acc3.groups = groupAcc3;

		System.out.println("Thong tin 3 account da tao tren he thong");
		System.out.println("Account 1: ID : " + acc1.id + " Email: " +

				acc1.email + " UserName: " + acc1.userName

				+ " FullName: " + acc1.fullName + " Department: " +

				acc1.department.name + " Position: "

				+ acc1.position.name + " Group: " + acc1.groups[0].name + " " + acc1.groups[1].name + " CreateDate: "
				+ acc1.createDate);

		System.out.println("Account 2: ID : " + acc2.id + " Email: " +

				acc2.email + " UserName: " + acc2.userName

				+ " FullName: " + acc2.fullName + " Department: " +

				acc2.department.name + " Position: "

				+ acc2.position.name + " Group: " + acc2.groups[0].name + " " + acc2.groups[1].name + " CreateDate: "
				+ acc2.createDate);

		System.out.println("Account 3: ID : " + acc3.id + " Email: " +

				acc3.email + " UserName: " + acc3.userName

				+ " FullName: " + acc3.fullName + " Department: " +

				acc3.department.name + " Position: "

				+ acc3.position.name + " Group: " + acc3.groups[0].name + " " + acc3.groups[1].name + " CreateDate: " +

				acc3.createDate);

		/*
		 * Question 1 Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department
		 * == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ
		 * in ra text "Phòng ban của nhân viên này là ..."
		 */
		System.out.println("Question 1: Kiem tra account thu 2:");
		if (acc2.department == null)
			System.out.println("Nhân viên này chưa có phòng ban");
		else
			System.out.println("Phòng ban của nhân viên này là " + acc2.department.name);

		/*
		 * Question 2: Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
		 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group"
		 * 
		 */
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

		// Question 3: Sử dụng toán tử ternary để làm Question 1
		System.out.println("Question 3: Kiem tra account thu 2 bằng toán tử ternary:");
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + acc2.department.name);

		/*
		 * Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của
		 * account thứ 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không
		 * phải thì in ra text "Người này không phải là Developer"
		 */
		System.out.println("Question 4: Kiểm tra position của account thứ 1");
		System.out.println(
				acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");

		/*
		 * Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format
		 * sau: Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" Nếu số lượng
		 * account = 2 thì in ra "Nhóm có hai thành viên" Nếu số lượng account = 3 thì
		 * in ra "Nhóm có ba thành viên" Còn lại in ra "Nhóm có nhiều thành viên"
		 */
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

		// Question 6: Sử dụng switch case để làm lại Question 2
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

		// Question 7: Sử dụng switch case để làm lại Question 4
		System.out.println("Question 7:");
		switch (acc1.position.name.toString()) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}

		// Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng
		// ban của họ
		System.out.println("Question 8:");
		Account[] accArray = { acc1, acc2, acc3 };
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " +

					account.email + " Name: " + account.fullName);
		}

		// Question 9: In ra thông tin các phòng ban bao gồm: id và name
		System.out.println("Question 9:");
		Department[] dpArray = { dp1, dp2, dp3 };
		for (Department department : dpArray) {
			System.out.println("DepartmentID: " + department.id + " DepartmentName: " + department.name);
		}

		/*
		 * Question 10: In ra thông tin các account bao gồm: Email, FullName và tên
		 * phòng ban của họ theo định dạng như sau: Thông tin account thứ 1 là: 
		 * Email: NguyenVanA@gmail.com 
		 * Full name: Nguyễn Văn A 
		 * Phòng ban: Sale Thông tin
		 * account thứ 2 là: 
		 * Email: NguyenVanB@gmail.com 
		 * Full name: Nguyễn Văn B 
		 * Phòng ban: Marketting
		 */
		System.out.println("Question 10:");
		Account[]accArray1 = {acc1, acc2, acc3 };
		for (int i = 0; i < accArray1.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");

			System.out.println("Email: " + accArray1[i].email);
			System.out.println("Full name: " + accArray1[i].fullName);
			System.out.println("Phòng ban: " + accArray1[i].department.name);
		}
	}
}
