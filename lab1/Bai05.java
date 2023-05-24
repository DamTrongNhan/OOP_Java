package buoi01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai05 {
	public static void pt(float a, float b) {
		double nghiem;
		DecimalFormat f = new DecimalFormat("#.##");

		System.out.println("Phuong trinh ban vua nhap la " + a + "x" + "+" + b + "=0");
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh nay co vo so nghiem");
			} else {
				System.out.println("Phuong trinh nay vo nghiem");
			}
		} else {
			nghiem = (double) -b / a;
			System.out.println("Nghiem la " + nghiem);
		}
	}

	public static void pt2(float a, float b, float c) {

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co 1 nghiem" + (-c / b));

			}
		}
		float x1, x2,x;
		float delta = b * b - 4 * a * c;
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phuong trinh co 2 nghiem x1= " + x1 + " x2= " + x2);
		} else if (delta == 0) {
			x = (float) (-b / 2 * a);
			System.out.println("Phuong trinh co nghiem kep x= " + x);
		} else
			System.out.println("Phuong trinh vo nghiem");

	}

	public static void main(String[] args) {
		float a, b;
		Bai05 g = new Bai05();
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai phuong trinh bac 1");
		System.out.println("Nhap vao so 1");
		a = sc.nextFloat();
		System.out.println("Nhap vao so 2");
		b = sc.nextFloat();
		g.pt(a, b);
		float d, e, f;
		System.out.println("Giai phuong trinh bac 2");
		System.out.println("Nhap he so 1");
		d = sc.nextFloat();
		System.out.println("Nhap he so 2");
		e = sc.nextFloat();
		System.out.println("Nhap he so 3");
		f = sc.nextFloat();
		g.pt2(d, e, f);
	}
}
