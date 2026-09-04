package tuan2;

public class Main {
	  public static void main(String[] arg) {
		  SinhVien sv1 = new SinhVien(1001, "Nguyễn Văn A", 8.5, 9.0);
	        SinhVien sv2 = new SinhVien(1002, "Nguyễn Văn B", 7.0, 8.5);
	        SinhVien sv3 = new SinhVien(1003, "Nguyễn Văn C", 9.0, 9.5);

	        System.out.printf("%-10s %-30s %5s %5s %5s%n",
	                "Mã SV",
	                "Họ tên",
	                "LT",
	                "TH",
	                "ĐTB");

	        System.out.println("---------------------------------------------------------------");

	        System.out.println(sv1);
	        System.out.println(sv2);
	        System.out.println(sv3);
	    }
}
