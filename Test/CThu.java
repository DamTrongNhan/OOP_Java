package ThucHanh;

import java.util.Scanner;

public class CThu extends CNguoi {
	private int so;
	private String vitri;
	private long banwin;
	private String mua;
	private String clb;

	public CThu() {
		super();
		so = 0;
		vitri = new String();
		banwin = 0;
		mua = new String();
		clb = new String();
	}

	public CThu(CThu ct) {
		super(ct);
		so = ct.so;
		vitri = new String(ct.vitri);
		banwin = ct.banwin;
		mua = new String(ct.mua);
		clb = new String(ct.clb);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap so ao thi dau");
		so = sc.nextInt();
		System.out.println("Nhap vi tri");
		sc.nextLine();
		vitri = sc.nextLine();
		System.out.println("Nhap so ban win ");
		banwin = sc.nextLong();
		System.out.println("Nhap mua");
		sc.nextLine();
		mua = sc.nextLine();
		System.out.println("Nhap CLB");
		clb = sc.nextLine();
	}

	public void in() {
		super.in();
		System.out.println("[" + so + "," + vitri + "," + banwin + "," + mua + "," + clb + "]");
	}

	public String toString() {
		return super.toString() + "[" + so + "," + vitri + "," + banwin + "," + mua + "," + clb + "]";
	}

	public long tinhLuong() {
		long tong = 7000000;
		if (vitri.equals("thu mon")) {
			tong = tong + 3000000 + (banwin * 500000);
			tong = tong - (long) (tong * 0.1);
			return tong;
		}
		if (vitri.equals("hau ve")) {
			tong = tong + 4000000 + (banwin * 500000);
			tong = tong - (long) (tong * 0.1);
			return tong;
		}
		if (vitri.equals("trung ve")) {
			tong = tong + 4500000 + (banwin * 500000);
			tong = tong - (long) (tong * 0.1);
			return tong;
		}
		if (vitri.equals("tien ve")) {
			tong = tong + 5000000 + (banwin * 500000);
			tong = tong - (long) (tong * 0.1);
			return tong;
		}
		if (vitri.equals("tien dao")) {
			tong = (long) tong + 7000000 + (banwin * 500000);
			tong = tong - (long) (tong * 0.1);
			return tong;
		}
		return tong;
	}

	public long soban(CThu a) {
		return a.banwin;
	}

	public long nam(CThu a) {
		String s;
		s = a.laynam(a);
		int p = s.lastIndexOf("-");
		s = s.substring(p + 1);
		long m = Integer.parseInt(s);
		return 2021 - m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		long cd1 = 0, cd2 = 0, cd3 = 0;
		System.out.println("Nhap so luong ");
		n = sc.nextInt();
		CThu ds[] = new CThu[n];
		for (i = 0; i < n; i++) {
			ds[i] = new CThu();
			ds[i].nhap();
		}
		for (i = 0; i < n; i++)
			ds[i].in();
		for (i = 0; i < n; i++)
			System.out.println(ds[i].tinhLuong());
		for (i = 0; i < n; i++)
		{
		if (ds[i].nam(ds[i]) > 18 && ds[i].nam(ds[i]) < 24)
		cd1 += ds[i].soban(ds[i]);else
		if (ds[i].nam(ds[i]) > 25 && ds[i].nam(ds[i]) < 28)
		cd2 += ds[i].soban(ds[i]);else
					if (ds[i].nam(ds[i]) > 28)
					cd3 += ds[i].soban(ds[i]);}
		System.out.println("Tu 18 den 24 " + cd1);
		System.out.println("Tu 25 den 28 " + cd2);
		System.out.println("Lon hon 25 " + cd3);
	}

}
