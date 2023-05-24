package buoi02;

import java.util.Scanner;

public class PhanSo {
	private int x, y;

	public PhanSo() {
		x = 1;
		y = 1;
	}

	public PhanSo(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public boolean hople() {
		boolean kt;
		kt = true;
		if (y == 0)
			kt = false;
		return kt;
	}

	public void nghichDao() {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao tu so ");
			x = sc.nextInt();
			System.out.println("Nhap vao mau so");
			y = sc.nextInt();
			if (!hople())
				System.out.println("Ban da nhap sai roi");
		} while (!hople());
	}

	public void in() {
		if (x == 0)
			System.out.println(0);
		else if ((x != 0) && (y == 1))
			System.out.println(x);
		else if (!hople())
			System.out.println("Nghich dao co van de");
		else
			System.out.println("Phan so " + x + "/" + y);
	}

	public int layx() {
		return x;
	}

	public int layy() {
		return y;
	}

	public void tinhkq() {
		float kq, a, b;
		a = (float) layx();
		b = (float) layy();
		kq = a / b;
		System.out.println(kq);
	}
	public  float tinhlay(PhanSo a[], int i) {
		float kq, a1, b;
		a1 = (float) a[i].x;
		b = (float) a[i].y;
		kq = a1 / b;
		return kq;
	}

	public float tinh(int a, int b) {
		float a1, b1;
		a1 = (float) a;
		b1 = (float) b;
		return a1 / b1;
	}

	public PhanSo nghichbutdao() {
		PhanSo kq = new PhanSo();
		kq.x = y;
		kq.y = x;
		return kq;
	}

	public boolean lonHon(PhanSo a) {
		boolean kt = true;
		if (tinh(x, y) < tinh(a.x, a.y))
			kt = false;
		return kt;
	}

	public PhanSo cong(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.x = x * a.y + y * a.x;
		kq.y = y * a.y;
		return kq;
	}

	public PhanSo tru(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.x = (x * a.y) - (y * a.x);
		kq.y = y * a.y;
		return kq;
	}

	public PhanSo nhan(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.x = x * a.x;
		kq.y = y * a.y;
		return kq;
	}

	public PhanSo chia(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.x = x * a.y;
		kq.y = y * a.x;
		return kq;
	}

	public PhanSo cong1(int n) {
		PhanSo kq = new PhanSo();
		kq.x = x * 1 + y * n;
		kq.y = y * 1;
		return kq;
	}

	public PhanSo tru1(int n) {
		PhanSo kq = new PhanSo();
		kq.x = (x * 1) - (y * n);
		kq.y = y * 1;
		return kq;
	}

	public PhanSo nhan1(int n) {
		PhanSo kq = new PhanSo();
		kq.x = x * n;
		kq.y = y;
		return kq;
	}

	public PhanSo chia1(int n) {
		PhanSo kq = new PhanSo();
		kq.x = x * 1;
		kq.y = y * n;
		return kq;
	}
	
}
