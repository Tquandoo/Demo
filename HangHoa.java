package BTH6;

import java.util.Scanner;

public abstract class HangHoa {
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private String donGia;
    private double VAT;

    private String ghichu;

    public String getGhichu() {
        return ghichu;
    }

    public void setVAT(double VAT){
        this.VAT=VAT;
    }
    public abstract String danhGiaHangHoa();

    public boolean equals (Object o)
    {
        if(o instanceof HangHoa){
            HangHoa hangHoa = (HangHoa) o;
            return this.maHang.equals(hangHoa.maHang);
        }
        return false;
    }
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public String getDonGia() {
        return donGia;
    }

    void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập tên hàng : ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhập mã hàng: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhập ghi chú: ");
        this.ghichu = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextLine();
        System.out.print("Nhập số lượng tồn: ");
        this.soLuongTon = sc.nextInt();
        sc.nextLine();
    }
    public static void inTieuDe (){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "Mã hàng","Tên hàng", "Ghi Chú","Đơn giá","Số lượng tồn","VAT");
    }
    void inDL(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20d %-20f", maHang, tenHang, ghichu, donGia, soLuongTon, VAT);
    }

}
