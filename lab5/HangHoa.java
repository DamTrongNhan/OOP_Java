package buoi05;

import java.util.Scanner;

public class HangHoa {
	private String maso;
	private String ten;
	private String nsx;

	public HangHoa() {
		maso = new String();
		ten = new String();
		nsx = new String();
	}

	public HangHoa(String m, String t, String n) {
		maso = new String(m);
		ten = new String(t);
		nsx = new String(n);
	}

	public HangHoa(HangHoa h) {
		maso = new String(h.maso);
		ten = new String(h.ten);
		nsx = new String(h.nsx);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma so hang hoa ");
		maso = sc.nextLine();
		System.out.println("Nhap vao ten hang hoa ");
		ten = sc.nextLine();
		System.out.println("Nhap vao nha san xuat hang hoa ");
		nsx = sc.nextLine();
	}

	public void in() {
		System.out.println("[" + maso + "," + ten + "," + nsx + "]");
	}

	public String toString() {
		return "[" + maso + "," + ten + "," + nsx + "]";
	}
}
