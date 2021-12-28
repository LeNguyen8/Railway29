import java.util.Scanner;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;
import entity.Position.PositionName;
import utils.ScannerUtil;

public class Main {
	public static void main(String[] args) {
		int input = 0;
		TestingSystem1 tSystem1 = new TestingSystem1();

		while (input != 100) {
			System.out.println("Nhap vao cau hoi : (100 -Thoat)");
			input = ScannerUtil.scanInt();
			switch (input) {
			case 1:
				System.out.println("------ Cau tra loi 1 ------");
				tSystem1.q1();
				break;
			case 2:
				System.out.println("----- Cau tra loi 2 -------");
				tSystem1.q2();
				break;
			case 100:
				System.out.println("Thoat chuong trinh");
				break;
			}
			System.out.println("-----------------------------");
		}

		}
	}
