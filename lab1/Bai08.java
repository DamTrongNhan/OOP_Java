package buoi01;

import java.util.Scanner;

public class Bai08 {
	int n;
	int a[];

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao n=");
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nhap vao phan tu thu " + i);
			a[i] = sc.nextInt();
		}
	}

	public void in() {
		System.out.println("In phan cac phan tu");
		for (int e : a)
			System.out.println(e);
	}

	public int dem(int x) {
		int count = 0;
		for (int e : a) {
			if (x == e)
				count++;
		}
		return count;
	}

	public void sap() {
		int t;
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++)
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}

	public static void main(String[] args) {
		int x;
		Bai08 d = new Bai08();
		Scanner sc = new Scanner(System.in);
		d.nhap();
		d.in();
		System.out.println("Sap cac phan tu ");
		d.sap();
		d.in();
		System.out.println("Nhap x de dem so lan xuat hien");
		x = sc.nextInt();
		System.out.println(x+" xuat hien " + d.dem(x) + " lan");
	}

}
