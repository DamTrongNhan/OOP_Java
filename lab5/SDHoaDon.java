package buoi05;

import java.util.Scanner;

public class SDHoaDon {

	public static void main(String[] args) {
		HoaDon hd = new HoaDon();
		System.out.println("Nhap hoa don");
		hd.nhap();
		System.out.println("In hoa don ");
		hd.in();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong bill ");
        n=sc.nextInt();
        HoaDon dh[] = new HoaDon[n];
        for (int i=0;i<n;i++)
        {
        	dh[i] = new HoaDon();
        	dh[i].nhap();
        }
        for (int i=0;i<n;i++)
        	dh[i].in();

}
}
