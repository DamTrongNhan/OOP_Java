package buoi05;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	private MyDate da;
	private KhachHang kh;
	private ChiTiet c[];
	private int sl;

	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		da = new MyDate();
		kh = new KhachHang();
		c = new ChiTiet[20];
		sl = 0;
	}

	public HoaDon(HoaDon h) {
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		da = new MyDate(h.da);
		kh = new KhachHang(h.kh);
		c = new ChiTiet[h.c.length];
		sl = h.sl;
		for (int i = 0; i < sl; i++) {
			c[i] = new ChiTiet(h.c[i]);
		}
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hoa don ");
		mso = sc.nextLine();
		System.out.println("Nhap tieu de hoa don ");
		tde = sc.nextLine();
		System.out.println("Nhap ten nhan vien hoa don ");
		nvien = sc.nextLine();
		da.nhap();
		int ck;
		System.out.println("Nhap 1 la khach hang 2 la khach hang vip");
		ck = sc.nextInt();
		if (ck == 1)
		    kh.nhap();
		else if (ck == 2)
			{kh = new KhachHangVIP();
		kh.nhap();}
		System.out.println("Nhap thong tin cac chi tiet");
		System.out.println("Nhap so luong chi tiet ");
		sl = sc.nextInt();
		for (int i = 0; i < sl; i++) {
			System.out.println("Nhap thong tin thu "+(i+1));
                 c[i] = new ChiTiet();
                 c[i].nhap();
		}
	}
	public void in()
	{
		System.out.println("["+mso+","+"nvien"+"]\n"+tde);
		System.out.println("Ngay "+da+" Thong tin Khach Hang: "+kh);
		for (int i=0;i<sl;i++)
		System.out.println("Chi tiet thu "+(i+1)+c[i]);
		System.out.println("Tong so tien "+tong());
	}
	public String toString()
	{
		String s="["+mso+","+"nvien"+"]\n"+tde;
		s+=(da+"/"+kh);
		for (int i=0;i<sl;i++)
		s+="Chi tiet thu "+(i+1)+c[i]+"\n";
		s+="Tong so tien "+tong();
		return s;
	}
	public float tong()
	{
		Float s=0.0f;
		for (int i=0; i<sl;i++)
			s= s+(c[i].laysl()*c[i].laydg());
		s=s-s*kh.laygiam();
			return s;
	}

}
