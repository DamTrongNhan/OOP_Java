package buoi02;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	public Diem() {
		x = 0;
		y = 0;
	}

	public Diem(int a, int b) {
		x = a;
		y = b;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hoanh do x ");
		x = sc.nextInt();
		System.out.println("Nhap tung do y ");
		y = sc.nextInt();
	}

	public void in() {
		System.out.println("(" + x + "," + y + ")");

	}

	public void doiDiem(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public float khoangCach() {
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
	}

	public int giaTriX() {
		return x;
	}

	public int giaTriY() {
		return y;
	}
}
