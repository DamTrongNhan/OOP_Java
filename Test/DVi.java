//STT:36, MSSV: B1910113, Hoten: Dam Trong Nhan, Nhom : 4, Made: 7
package b1910113;

import java.util.Scanner;

public class DVi {
	private String mdv;
	private String tendv;
	private int giuong;
	private boolean dchien;

	public DVi() {
		mdv = new String();
		tendv = new String();
		giuong = 0;
		dchien = true;
	}

	public DVi(DVi dv) {
		mdv = new String(dv.mdv);
		tendv = new String(dv.tendv);
		giuong = dv.giuong;
		dchien = dv.dchien;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma don vi");
		mdv = sc.nextLine();
		System.out.println("Nhap ten don vi");
		tendv = sc.nextLine();
		System.out.println("Nhap so giuong");
		giuong = sc.nextInt();
		System.out.println("Co phai da chien khong");
		dchien = sc.nextBoolean();
	}

	public boolean laygt() {
		return dchien;
	}

	public void xuat() {
		if (laygt())
			System.out.println(mdv + "," + tendv + ","  + giuong + "," + "Day la da chien");
		else
			System.out.println(mdv + "," + tendv + "," + giuong + "," + "Day khong phai la da chien");
	}

	public String laydv()
	{
		return mdv;
	}
	public static void main(String[] args) {
		DVi dv1 = new DVi();
		System.out.println("Nhap don vi 1");
		dv1.nhap();
		dv1.xuat();
		DVi dv2 = new DVi(dv1);
		System.out.println("In don vi 2");
		dv2.xuat();

	}

}
