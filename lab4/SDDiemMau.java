package buoi04;

public class SDDiemMau {

	public static void main(String[] args) {
		System.out.println("Diem Mau A");
		DiemMau A = new DiemMau(5, 10, "Mau Trang");
		A.in();
		DiemMau B = new DiemMau();
		System.out.println("Nhap Diem Mau B");
		B.nhap();
		System.out.println("In Diem Mau B");
		B.in();
		System.out.println("Diem mau B sau khi tinh tien");
		B.tinhTien(8, 10);
		B.in();
		System.out.println("Diem Mau B sau khi doi thanh mau vang");
		B.GanMau("Vang");
		B.in();
	}

}
