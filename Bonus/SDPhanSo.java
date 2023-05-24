package buoi02;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo f = new PhanSo();
		// PhanSo c = new PhanSo();
		// f.in();
		// PhanSo g = new PhanSo(5,5);
		// g.in();
		f.nhap();
		f.in();
		/*// f.nghichDao();
		// f.in();
		// f.tinhkq();
		// c=f.nghichbutdao();
		// c.in();
		// f.in();
		PhanSo a = new PhanSo(1, 2);
		if (f.lonHon(a))
			System.out.println("Phan so Lon hon a");
		else
			System.out.println("Phan so Nho hon a");
		
		 * PhanSo i = new PhanSo(); PhanSo j = new PhanSo(); PhanSo k = new PhanSo();
		 * PhanSo l = new PhanSo(); int n = 3; i = f.cong1(n); j = f.tru1(n); k =
		 * f.nhan1(n); l = f.chia1(n); i.in(); j.in(); k.in(); l.in();
		 */
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong mang phan so");
		n=sc.nextInt();
		PhanSo a[] = new PhanSo[n];
		for ( i=0;i<n;i++)
		{
			a[i] = new PhanSo();
			a[i].nhap();
		}
		for ( i=0;i<n;i++)
		{
			a[i].in();
		}
		int tam=0;
		float max=a[0].tinhlay(a,0),kq=0;
		for ( i=1 ;i<n;i++)
			if (a[i].tinhlay(a,i)>max)
			{
				max=a[i].tinhlay(a,i);
				tam=i;
			}
		System.out.println("Phan tu lon nhat ");
		a[tam].in();
		for (i=0;i<a.length;i++)
		{
			kq=kq+a[i].tinhlay(a, i);
		}
		PhanSo temp = new PhanSo();
		System.out.format("Tong phan so %.2f\n",kq);
		for (i=0;i<a.length-1;i++)
		   for (int j=a.length-1;j>=i+1;j--)
		   if (a[j].tinhlay(a, i)<a[j-1].tinhlay(a,i))
		   {
			   temp=a[j];
			   a[j]=a[j-1];
			   a[j-1]=temp;
		   }
		for (i=0;i<a.length;i++)
			a[i].in();
	}
}
