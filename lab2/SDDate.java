package buoi02;

import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date(16, 9, 2021);
		d1.in();
		Date d2 = new Date();
		Date d3 = new Date();
		System.out.println("Nhap ngay thang nam cua d2");
		d2.nhap();
		System.out.println("In ngay thang nam vua nhap ");
		d2.in();
		System.out.println("Ngay hom sau cua ngay moi nhap");
		d3=d2.ngayHomSau();
		d3.in();
		System.out.println("Nhap vao so n muon cong ngay ");
		int n = sc.nextInt();
		d2=d2.congNgay(n);
		System.out.println("In ngay thang nam");
		d2.in();
	}
}
