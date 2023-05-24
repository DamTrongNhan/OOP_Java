package buoi05;

import java.util.Scanner;
import buoi05.MyDate;
public class KhachHangVIP extends KhachHang {
	private float tLeGiam;
	private MyDate da;

	public KhachHangVIP() {
		super();
		tLeGiam = 0.0f;
		da = new MyDate();
	}

	public KhachHangVIP(KhachHang kh, float l, MyDate k) {
		super(kh);
		tLeGiam = l;
		da = new MyDate(k);
	}

	public KhachHangVIP(KhachHangVIP kv) {
		super(kv);
		tLeGiam = kv.tLeGiam;
		da = new MyDate(kv.da);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);

		super.nhap();
		System.out.println("Nhap ti le giam cua khach hang");
		tLeGiam = sc.nextFloat();
		da.nhap();
	}

	public void in() {
		super.in();
		System.out.println("\nTi le Giam " + tLeGiam + "[" + da + "]");
	}

	public String toString() {
		return super.toString() + "\nTi le Giam " + tLeGiam + "[" + da + "]";
	}
	public float laygiam()
	{
		return tLeGiam;
	}
}
