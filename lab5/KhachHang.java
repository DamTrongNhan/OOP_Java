package buoi05;

import java.util.Scanner;

public class KhachHang {
       private String hoten;
       private String cccd;
       private String diachi;
       private Float tLeGiam;
    public KhachHang()
    {
    	hoten = new String();
    	cccd = new String();
    	diachi = new String();
    }
    public KhachHang(String h, String c, String d)
    {
    	hoten = new String(h);
    	cccd = new String(c);
    	diachi = new String(d);
    }
    public KhachHang(KhachHang k)
    {
    	hoten = new String(k.hoten);
    	cccd = new String(k.cccd);
    	diachi = new String(k.diachi);
    }
    public void nhap()
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Nhap ho ten khach hang ");
    	hoten=sc.nextLine();
    	System.out.println("Nhap cccd khach hang ");
    	cccd=sc.nextLine();
    	System.out.println("Nhap dia chi khach hang ");
    	diachi=sc.nextLine();
    }
    public void in()
    {
    	System.out.println("["+hoten+","+cccd+","+diachi+"]");
    }
    public String toString()
    {
    	return "["+hoten+","+cccd+","+diachi+"]";
    }
    public float laygiam()
	{
		return 0.0f;
	}
}
