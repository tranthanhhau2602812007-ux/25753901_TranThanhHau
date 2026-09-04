package tuan3;
public class Vehicle {
   
    private String chuXe;
    private String loaiXe;
    private double triGia;
    private double dungTich;

    public Vehicle() {
    }

    public Vehicle(String chuXe, String loaiXe, double triGia, double dungTich)throws Exception {
        setChuXe(chuXe);
        setLoaiXe(loaiXe);
        setTriGia(triGia);
        setDungTich(dungTich);
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) throws Exception{
        if (chuXe == null || chuXe.trim().isEmpty()) {
            throw new Exception("Tên chủ xe không được rỗng!");
        }
        this.chuXe = chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) throws Exception{
        if (loaiXe == null || loaiXe.trim().isEmpty()) {
            throw new Exception("Loại xe không được rỗng!");
        }
        this.loaiXe = loaiXe;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) throws Exception{
        if (triGia < 0) {
            throw new Exception("Trị giá phải >= 0!");
        }
        this.triGia = triGia;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(double dungTich)throws Exception {
        if (dungTich < 0) {
            throw new Exception("Dung tích phải >= 0!");
        }
        this.dungTich = dungTich;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }
}

