package buoi01;

import java.util.Scanner;

public class Bai07 {
	public String tachten(String s)
    {
    	s = s.trim();
		int p = s.lastIndexOf(" ");
		s = s.substring(p + 1);
		return s;
    }

	public static void main(String[] args) {
		String s;
		Bai07 d = new Bai07();
		System.out.println("Nhap ho va ten");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println("Tach ten ");
		System.out.println(d.tachten(s));

	}

}
