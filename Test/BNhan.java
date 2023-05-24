//STT:36, MSSV: B1910113, Hoten: Dam Trong Nhan, Nhom : 4, Made: 7
package b1910113;

import java.util.Scanner;

public class BNhan {
	private DVi dv;
	private String ten;
	private String ngay;
	private float cnang;

	public BNhan() {
		dv = new DVi();
		ten = new String();
		ngay = new String();
		cnang = 0.0f;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap don vi");
		dv.nhap();
		System.out.println("Nhap ten benh nhan");
		ten = sc.nextLine();
		System.out.println("Nhap ngay nhap vien");
		ngay = sc.nextLine();
		System.out.println("Nhap can nang");
		cnang = sc.nextFloat();
	}

	public void xuat() {
		dv.xuat();
		System.out.println(ten + "," + ngay + ","+ cnang);
	}
	public String layngay()
	{
		return ngay;
	}
	public String layten()
	{
		return ten;
	}
	public String tdv()
	{
		return dv.laydv();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,i,j;
		System.out.println("Nhap so luong benh nhan");
		m=sc.nextInt();
		BNhan bn[] = new BNhan[m];
		for (i=0;i<m;i++)
		{
			bn[i]= new BNhan();
			bn[i].nhap();
		}
		for (i=0;i<m;i++)
		{
			bn[i].xuat();
		}
		for (i=0;i<m;i++)
		{
			if (bn[i].layten().equals("Tran Anh Hao ")&&bn[i].layngay().equals("21/11/2021"))
					System.out.println(bn[i].tdv());
		}
		

	}

}
