import java.util.Scanner;

public class uoc {
          private int n;
          public uoc()
          {
        	  n=0;
          }
          public void nhap()
          {
        	  Scanner sc = new Scanner(System.in);
        	  System.out.println("Nhap n");
        	  n=sc.nextInt();
          }
          public void in()
          {int i;
        	  for ( i=n;i>=1;i--) {
        		  if (n%i==0)
        			  System.out.println(i);}
          }
	public static void main(String[] args) {
		uoc n = new uoc();
		n.nhap();
		n.in();

	}

}
