package buoi04;

import java.util.Scanner;

public class SDSVCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("Nhap vao so luong sinh vien");
		n = sc.nextInt();
		SinhVienCNTT a[] = new SinhVienCNTT[n];
		for (i = 0; i < n; i++) {
			a[i] = new SinhVienCNTT();
			a[i].nhap();
			a[i].dk();
			a[i].nhapdiem();
		}
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Nhap vao dia chi email can tim");
		boolean k=false;
		
		String email;
		sc.nextLine();
		email = sc.nextLine();	
		for (i = 0; i < n; i++)
			if ((a[i].getEmail()).equals(email)) {
				System.out.println("Da tim duoc Sinh Vien co Tai Khoan " + a[i].getTaiKhoan());
				System.out.println("Ket qua hoc tap "+a[i].trungbinh());
				k=true;
				break;
			}
		if (!k)
			System.out.println("Khong tim thay");

	}
}
