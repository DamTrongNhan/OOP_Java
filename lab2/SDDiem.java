package buoi02;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		System.out.println("Toa do diem a ");
		A.in();
		Diem B = new Diem();
		B.nhap();
		System.out.println("Toa do diem b ");
		B.in();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.println("Tao toa do diem c ");
		C.in();
		System.out.println("Khoang cach BO = " + B.khoangCach());
		System.out.println("Khoang cach AB = " + A.khoangCach(B));
	}

}
