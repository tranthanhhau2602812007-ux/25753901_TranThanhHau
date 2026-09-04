package tuan3;

public class Main{
    public static void main(String[] args) throws Exception {

        Vehicle xe1 = new Vehicle(
                "Nguyễn Thu Loan",
                "Future Neo",
                105000000,
                100
        );

        Vehicle xe2 = new Vehicle(
                "Lê Minh Tình",
                "Ford Ranger",
                250000000,
                3000
        );

        Vehicle xe3 = new Vehicle(
                "Nguyễn Minh Triết",
                "Landscape",
                1000000000,
                1500
        );

        System.out.printf("%-20s %-15s %12s %18s %18s%n",
                "Tên chủ xe",
                "Loại xe",
                "Dung tích",
                "Trị giá",
                "Thuế phải nộp");

        System.out.println("-------------------------------------------------------------------------------");

        xuatXe(xe1);
        xuatXe(xe2);
        xuatXe(xe3);
    }

    public static void xuatXe(Vehicle xe) {
        System.out.printf("%-20s %-15s %12.0f %,18.2f %,18.2f%n",
                xe.getChuXe(),
                xe.getLoaiXe(),
                xe.getDungTich(),
                xe.getTriGia(),
                xe.tinhThue());
    }}