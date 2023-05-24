package buoi04;

import java.util.Scanner;

import buoi02.Diem;

public class DiemMau extends Diem {
	private String color;

	public DiemMau() {
		super();
		color = new String();
	}
	public DiemMau(int x1, int y1, String m) {
		super(x1,y1);
		color = new String(m);
	}
	public DiemMau(DiemMau dmau) {
		super( (DiemMau) dmau);
		color = new String(dmau.color);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap mau cho diem: ");
		color=sc.nextLine();
	}
	public void in()
	{
		super.in();
		System.out.println(" Co Mau "+color);
	}
	 public String toString()
	 {
		 return super.toString()+"Co Mau "+color;
	 }
     public void GanMau(String colorm)
     {
    	 color = new String(colorm);
     }
	
}
