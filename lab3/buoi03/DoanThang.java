package buoi03;

import java.util.Scanner;
import buoi02.Diem;

public class DoanThang {
	private Diem d1, d2;

	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}

	public DoanThang(Diem x1, Diem x2) {
		d1 = new Diem(x1);
		d2 = new Diem(x2);
	}

	public DoanThang(int x1, int x2, int y1, int y2) {
		d1 = new Diem(x1, y1);
		d2 = new Diem(x2, y2);
	}

	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do diem dau");
		d1.nhap();
		System.out.println("Nhap toa do diem cuoi");
		d2.nhap();
	}

	public void in() {
		d1.in();
		System.out.print(",");
		d2.in();
		System.out.println();
	}

	public String toString() {
		return "[" + d1 + "," + d2 + "]";
	}

	public void tinhTien(int dx, int dy) {
		d1.tinhTien(dx, dy);
		d2.tinhTien(dx, dy);
	}

	public float khoangCach() {
		return d1.khoangCach(d2);
	}

	public Diem trungDiem() {
		Diem i = new Diem();
		i.ganx((d1.layx() + d1.layy()) / 2);
		i.gany((d2.layx() + d2.layy()) / 2);
		return i;
	}

	public float doDai() {
		float dd;
		dd = (float) Math.sqrt((d2.layx() - d1.layx()) + (d2.layy() - d2.layy()));
		return dd;
	}

}
