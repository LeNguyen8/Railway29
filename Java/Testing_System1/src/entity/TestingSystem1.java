package entity;

public class TestingSystem1 {
	Department dp1, dp2, dp3;
	Department[] listDepartments = new Department[3];

	Account acc1, acc2, acc3, acc4;
	Account[] listAccounts = new Account[4];
	

	public TestingSystem1() {
		dp1 = new Department(1, "Phong Dev");
		dp2 = new Department(2, "Phong Marketing");
		dp3 = new Department(3, "Phong Sale");

		listDepartments[0] = dp1;
		listDepartments[1] = dp2;
		listDepartments[2] = dp3;

		acc1 = new Account(1, "vti_1", dp1);
		acc2 = new Account(2, "vti_2", dp1);
		acc3 = new Account(3, "vti_2", dp3);
		acc4 = new Account(4, "vti_4");

		listAccounts[0] = acc1;
		listAccounts[1] = acc2;
		listAccounts[2] = acc3;
		listAccounts[3] = acc4;

	}

	public void q1() {
		for (int i = 0; i < listAccounts.length; i++) {
			Account a = listAccounts[i];
			if (a.getDepartment() == null) {
				System.out.println(a.getUserName() + "=>Không có phòng ban");
			} else {
				System.out.println(a.getUserName() + "=>" + a.getDepartment().getName());
			}
		}

	}

	
	public void q2() {
		for (Account account : listAccounts) {
			System.out.println(account);
		}
		System.out.println("--------------");
		for (Department department : listDepartments) {
			System.out.println(department);
			
		}
	}
}
