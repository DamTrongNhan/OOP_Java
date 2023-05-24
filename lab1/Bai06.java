package buoi01;

import java.util.Arrays;
import java.util.Scanner;

public class Bai06 {

	public boolean is(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void nhiphan(int n) {
		int a[];
		int i = 0;
		a = new int[1];
		do {
			a[i] = n % 2;
			a = Arrays.copyOf(a, a.length + 1);
			i++;
			n = n / 2;
		} while (n != 0);
		for (i = a.length - 2; i >= 0; i--)
			System.out.print(a[i]);
	}

	public static void main(String[] args) {
		int b;
		Bai06 f = new Bai06();
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		if (f.is(b)) {
			System.out.println(b+" La so nguyen to");
		} else {
			System.out.println(b+" Khong la so nguyen to");
		}
		System.out.println("Doi "+b+" sang nhi phan:");
		f.nhiphan(b);
	}
}