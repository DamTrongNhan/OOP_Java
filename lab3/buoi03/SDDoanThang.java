package buoi03;

import buoi02.Diem;


public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(25, 30);
		DoanThang AB = new DoanThang(A, B);
		DoanThang CD = new DoanThang();
		System.out.println("Doan thang AB" + AB);
		AB.tinhTien(5, 3);
		System.out.println("Doan thang AB sau khi tinh tien");
		AB.in();
		System.out.println("Tao doan thang CD");
		CD.nhap();
		CD.in();
		// System.out.format("Khoang cach CD la %.2f", cd.khoangCach());
		System.out.println("Do dai cua CD la " + CD.doDai());
		Diem d = new Diem();
		System.out.println("Trung diem cua CD");
		d = CD.trungDiem();
		d.in();
	}

}
