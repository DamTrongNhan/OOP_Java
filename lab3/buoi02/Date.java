package buoi02;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;

	public Date() {
		ngay = 16;
		thang = 9;
		nam = 2021;
	}

	public Date(int ngayd, int thangd, int namd) {
		ngay = ngayd;
		thang = thangd;
		nam = namd;
	}
    public Date(Date s)
    {
    	ngay=s.ngay;
    	thang=s.thang;
    	nam=s.nam;
    }
	public void nhap() {
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ngay ");
			ngay = sc.nextInt();
			System.out.println("Nhap thang ");
			thang = sc.nextInt();
			System.out.println("Nhap nam ");
			nam = sc.nextInt();
			if (!hopLe())
				System.out.println("Ban da nhap sai!Vui long nhap lai.");
		} while (!hopLe());
	}

	public void in() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public boolean hopLe() {
		int a[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (nam % 4 == 0)
			a[2] = 29;
		boolean kt = false;
		if (ngay > 0 && thang > 0 && nam > 0 && ngay <= a[thang] && thang < 13)
			kt = true;
		return kt;
	}

	public Date ngayHomSau() {
		Date kq = new Date(ngay, thang, nam);
		kq.ngay++;
		if (!kq.hopLe()) {
			kq.ngay = 1;
			kq.thang++;
			if (!kq.hopLe()) {
				kq.thang = 1;
				kq.nam++;
			}
		}
		return kq;
	}

	public Date congNgay(int n) {
		Date kq = new Date(ngay, thang, nam);
		for (int i = 0; i < n; i++)
			kq = kq.ngayHomSau();
		return kq;
	}
	public String toString()
	{
		return (ngay + "/" + thang + "/" + nam);
	}

}
