package buoi04;

import java.util.Scanner;

import buoi02.Date;
import buoi02.PhanSo;
import buoi03.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String tkhoan, mkhau, email;

	public SinhVienCNTT() {
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}

	public SinhVienCNTT(String m, String h, Date n, String t, String mk, String e) {
		super(m, h, n);
		tkhoan = new String(t);
		mkhau = new String(mk);
		email = new String(e);
	}

	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		tkhoan = new String(sv.tkhoan);
		mkhau = new String(sv.mkhau);
		email = new String(sv.email);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap Tai Khoan");
		tkhoan = sc.nextLine();
		System.out.println("Nhap Mat Khau");
		mkhau = sc.nextLine();
		System.out.println("Nhap Email");
		email = sc.nextLine();
	}

	public String toString() {
		return super.toString() + " |Tai Khoan: " + tkhoan + " |Email: " + email;
	}

	public void doiMatKhau(String pass) {
		mkhau = new String(pass);
	}

	public String getEmail() {
		return email;
	}
    public String getTaiKhoan()
    {
    	return tkhoan;
    }

}
