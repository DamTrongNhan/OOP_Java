package buoi05;

import java.util.Scanner;

public class MyDate {
	private int ngay, thang, nam;

	public MyDate() {
		ngay = 16;
		thang = 9;
		nam = 2021;
	}

	public MyDate(int ngayd, int thangd, int namd) {
		ngay = ngayd;
		thang = thangd;
		nam = namd;
	}
    public MyDate(MyDate s)
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

	public MyDate ngayHomSau() {
		MyDate kq = new MyDate(ngay, thang, nam);
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

	public MyDate congNgay(int n) {
		MyDate kq = new MyDate(ngay, thang, nam);
		for (int i = 0; i < n; i++)
			kq = kq.ngayHomSau();
		return kq;
	}
	public String toString()
	{
		return (ngay + "/" + thang + "/" + nam);
	}

}
