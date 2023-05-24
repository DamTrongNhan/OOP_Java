package ThucHanh;

import java.util.Scanner;

public class CNguoi {
	private String id;
	private String hoten;
	private String ngay;
	private char phai;

	public CNguoi() {
		id = new String();
		hoten = new String();
		ngay = new String();
		phai = 0;
	}

	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hoten = new String(cn.hoten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
	}
     public void nhap()
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Nhap CMND");
    	 id = sc.nextLine();
    	 System.out.println("Nhap ho ten");
    	 hoten = sc.nextLine();
    	 System.out.println("Nhap ngay sinh");
    	 ngay = sc.nextLine();
    	 System.out.println("Nhap phai");
    	 phai = sc.next().charAt(0); 
     }
     public void in()
     {
    	 System.out.println("["+id+","+hoten+","+ngay+","+phai+"]");
     }
     public String toString()
     {
    	 return "["+id+","+hoten+","+ngay+","+phai+"]";
     }
    public String laynam(CNguoi a)
    {
    	return a.ngay;
    }
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		System.out.println("Nhap 1");
		c1.nhap();
		System.out.println("In 1");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.println("In 2");
		c2.in();
	}

}
