package BTH6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class hangThucPham extends HangHoa {
    private Ngay NSX;
    private Ngay HSD;

    public hangThucPham(){

    }
    private String nhaCungCap;

    boolean isHetHan(){
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yy");
        try {
            Date hanDung = simpleDateFormat.parse(HSD.toString());
            return hanDung.compareTo(now) >=0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    public String danhGiaHangHoa(){
        if(super.getSoLuongTon()>0 && isHetHan()){
            return "Khó bán";
        }
        return "bán được";
    }
    public  static void inTieuDe()
    {
        HangHoa.inTieuDe();
        System.out.printf("%-20s %-20s %-20s %-20s\n","NSX","HSD","Nhà cung cấp","Mức độ bán");;
    }

    public void inDL(){
        super.inDL();
        System.out.printf("%-20s %-20s %-20s %-20s\n", NSX.toString(), HSD.toString(), nhaCungCap.toString(), danhGiaHangHoa().toString());
    }

    public void nhap()
    {
        super.setVAT(5);
        super.nhap();
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhập ngày sản xuất:");
        this.NSX = new Ngay();
        NSX.nhap();
        System.out.println("Nhập hạn sử dụng:");
        this.HSD = new Ngay();
        HSD.nhap();
        System.out.print("Nhập nhà cung cấp: ");
        nhaCungCap = sc.nextLine();
    }

}
class TestThucPham {
    public static void main(String[] args) {
        hangThucPham thucPham = new hangThucPham();
        thucPham.nhap();
        hangThucPham.inTieuDe();
        thucPham.inDL();
    }
}
