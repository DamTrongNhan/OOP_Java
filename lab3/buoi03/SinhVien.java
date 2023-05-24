package buoi03;

import java.util.Scanner;
import buoi02.Date;

public class SinhVien {
	private String mssv;
	private String hoten;
	private Date ngaysinh;
	private int sl;
	private int max;
	private String ten[];
	private String diem[];

	public SinhVien() {
		mssv = new String();
		hoten = new String();
		ngaysinh = new Date();
		sl = 0;
		max = 50;
		ten = new String[max];
		diem = new String[max];
	}

	public SinhVien(int sl2, int max2) {
		mssv = new String();
		hoten = new String();
		ngaysinh = new Date();
		sl = sl2;
		max = max2;
		ten = new String[max];
		diem = new String[max];
	}

	public SinhVien(String mssv1, String hoten1, Date ngaysinh1) {
		mssv = new String(mssv1);
		hoten = new String(hoten1);
		ngaysinh = new Date(ngaysinh1);
		sl = 0;
		max = 50;
		ten = new String[max];
		diem = new String[max];
	}

	public SinhVien(SinhVien s) {
		mssv = new String(s.mssv);
		hoten = new String(s.hoten);
		ngaysinh = new Date(s.ngaysinh);
		sl = s.sl;
		max = s.max;
		ten = new String[max];
		diem = new String[max];
		for (int i = 0; i < sl; i++) {
			ten[i] = new String(s.ten[i]);
			diem[i] = new String(s.diem[i]);
		}
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten sinh vien ");
		hoten = sc.nextLine();
		System.out.println("Nhap ma so sinh vien ");
		mssv = sc.nextLine();
		System.out.println("Nhap ngay sinh");
		ngaysinh.nhap();

	}

	public void in() {
		System.out.println("Ho ten:" + hoten + "|" + "MSSV:" + mssv +  "|" + "Ngay sinh:" + ngaysinh);
		for (int i = 0; i < sl; i++) {
			System.out.print("Hoc Phan:" + ten[i] + ":" + diem[i] + "  ");

		}
		System.out.println();
	}

	public void inten() {
		System.out.println(hoten);
	}

	public String toString() {
		String s = ("Ho ten:" + hoten + "|" + "MSSV:" + mssv + "|" + "Ngay Sinh:" + ngaysinh);
		for (int i = 0; i < sl; i++) {
			s += ("Mon:" + ten[i] + ":" + diem[i]);
		}
		return s;
	}
	public void them(String ten2, String diem2) {
		if (sl < max - 1) {
			ten[sl] = new String(ten2);
			diem[sl] = new String(diem2);
			sl++;
		} else
			System.out.println("Khong the them limit");
	}

	public void xoa(String ten3) {
		int i;
		for (i = 0; i < sl; i++)
			if (ten[i].equals(ten3))
				break;
		for (int j = i; j < sl - 1; j++) {
			ten[j] = ten[j + 1];
			diem[j] = diem[j + 1];
		}
		sl--;
	}

	public void dk() {
		Scanner sc = new Scanner(System.in);
		String ten = "";
		System.out.println("Nhap cac mon dang ky");
		do {
			System.out.println("Nhap ten mon ");
			ten = sc.nextLine();
			if (ten.equals("Stop"))
				break;
			them(ten, "");
		} while (true);
	}

	public void nhapdiem() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sl; i++) {
			System.out.println("Nhap diem " + ten[i]);
			diem[i] = sc.nextLine();
		}
	}
    public String layten()
    {
        String s;
    	hoten=hoten.trim();
        int p=hoten.lastIndexOf(" ");
        s=hoten.substring(p+1,p+2);
        return s;
    }
	public float trungbinh() {
		float d = 0.0f;
		for (int i = 0; i < sl; i++) {
			if (diem[i].equals("A"))
				d += 4;
			else if (diem[i].equals("B+"))
				d += 3.5f;
			else if (diem[i].equals("B"))
				d += 3.0f;
			else if (diem[i].equals("C+"))
				d += 3;
			else if (diem[i].equals("C"))
				d += 2.5f;
			else if (diem[i].equals("D+"))
				d += 2.0f;
			else if (diem[i].equals("D"))
				d += 1.5f;
			else if (diem[i].equals("F"))
				d += 0;
		}
		return d / sl;
	}
}
