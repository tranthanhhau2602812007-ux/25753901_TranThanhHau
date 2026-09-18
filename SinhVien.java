public class SinhVien {

    private int maSV;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien() {
        maSV = 0;
        hoTen = "Chưa xác định";
        diemLT = 0.0;
        diemTH = 0.0;
    }


    public SinhVien(int maSV, String hoTen,
                    double diemLT, double diemTH) {

        setMaSV(maSV);
        setHoTen(hoTen);
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }


    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        if (maSV > 0) {
            this.maSV = maSV;
        } else {
            this.maSV = 0;
        }
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {

        if (hoTen != null && !hoTen.trim().isEmpty()) {
            this.hoTen = hoTen;
        } else {
            this.hoTen = "Chưa xác định";
        }
    }
    
    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {

        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        } else {
            this.diemLT = 0.0;
        }
    }
    
    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {

        if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        } else {
            this.diemTH = 0.0;
        }
    }


    public double tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {

        return String.format(
                "%-10d %-30s %5.2f %5.2f %5.2f",
                maSV,
                hoTen,
                diemLT,
                diemTH,
                tinhDiemTB()
        );
    }

    public static void main(String[] arg) {
    	SinhVien sv = new SinhVien();
    	
    	System.out.println(sv);
    }
}


