package buoi05;
import java.util.Scanner;

import buoi05.HangHoa;
public class ChiTiet {
		private int sl;
		private float dg;
		private HangHoa h;
		public ChiTiet()
		{
			sl=0;
			dg=0.0f;
			h = new HangHoa();
		}
		public ChiTiet(int s, float d, HangHoa k)
		{
			sl=s;
			dg=d;
			h = new HangHoa(k);
		}
		public ChiTiet(ChiTiet c)
		{
			sl=c.sl;
			dg=c.dg;
			h = new HangHoa(c.h);
		}
		public void nhap()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao so luong ");
			sl=sc.nextInt();
			System.out.println("Nhap vao don gia ");
			dg=sc.nextFloat();
			h.nhap();
		}
		public void in()
		{
			System.out.println("["+sl+","+dg+"]"+h);
		}
		public String toString()
		{
			return "["+sl+","+dg+"]"+h;
		}
		public int laysl()
		{
			return sl;
		}
		public float laydg()
		{
			return dg;
		}
}
