package buoi02;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	public Diem() {
		x = 1;
		y = 1;
	}

	public Diem(int a, int b) {
		x = a;
		y = b;
	}
    public Diem(Diem dt)
    {
    	x=dt.x;
    	y=dt.y;
    }
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hoanh do x ");
		x = sc.nextInt();
		System.out.println("Nhap tung do y ");
		y = sc.nextInt();
	}

	public void in() {
		System.out.print("(" + x + "," + y + ")");

	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public void tinhTien(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public float khoangCach() {
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
	}

	public int layx() {
		return x;
	}

	public int layy() {
		return y;
	}
	public void ganx(int x1)
	{
		x=x1;
	}
	public void gany(int y1)
	{
		y=y1;
	}
}
