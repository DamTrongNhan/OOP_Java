package buoi03;

import java.util.Arrays;
import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien A = new SinhVien(0, 5);
		System.out.println("Nhap thong tin sinh vien A");
		System.out.println("Nhap vao Stop khi muon dung nhap Mon Hoc");
		A.nhap();
		A.dk();
		A.nhapdiem();
		System.out.println("Thong tin sinh vien A");
		A.in();
		System.out.println("Diem trung binh cua sinh vien A:" + A.trungbinh());
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tao mang sinh vien theo so luong n");
		n = sc.nextInt();
		SinhVien b[] = new SinhVien[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = new SinhVien();
			b[i].nhap();
			b[i].dk();
			b[i].nhapdiem();
		}
		for (int i = 0; i < b.length; i++) {
			b[i].in();
		}
		float max = b[0].trungbinh();
		int k = 0;
		for (int i = 1; i < b.length; i++) {
			if (max < (b[i].trungbinh())) {
				max = b[i].trungbinh();
                k=i;
			}
		}
		System.out.println("Sinh Vien co Diem Trung Binh lon nhat la ");
		b[k].inten();
		System.out.println("Nhung sinh vien bi canh bao hoc vu ");
		for (int i = 0; i < b.length; i++) {
			if (b[i].trungbinh() < 1)
				b[i].inten();
		}
		SinhVien temp = new SinhVien();
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++)

				if ((b[i].layten()).compareTo(b[j].layten()) > 0) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}

		}
		System.out.println("Sap danh sach sinh vien theo chu cai Alphabet");
		for (int i = 0; i < b.length; i++) {
			b[i].in();
		}
	}

}
