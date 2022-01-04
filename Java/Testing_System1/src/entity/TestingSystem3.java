package entity;

public class TestingSystem3 {

	public static void main(String[] args) {

	}

	/*
	 * Question 1: Khai báo 2 số lương có kiểu dữ liệu là float. Khởi tạo Lương của
	 * Account 1 là 5240.5 $ Khởi tạo Lương của Account 2 là 10970.055$ Khai báo 1
	 * số int để làm tròn Lương của Account 1 và in số int đó ra Khai báo 1 số int
	 * để làm tròn Lương của Account 2 và in số int đó ra
	 */
	public void q1() {
		float Salary1;
		float Salary2;
		Salary1 = 5240.5f;
		Salary2 = 10970.055f;
		int roundSalary1 = (int) Salary1;
		int roundSalary2 = (int) Salary2;
		System.out.println("roundSalary1 = " + roundSalary1 + " roundSalary2 = " + roundSalary2);
	}

	/*
	 * Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ
	 * thêm có số 0 ở cuối cho đủ 5 chữ số)
	 */
	public void q2() {
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		while (a < 10000) {
		a = a * 10;
		}
		System.out.println("Số ngẫu nhiên: " + a);
		Math.random();
	}
}
