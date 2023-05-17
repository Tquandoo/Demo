package BTH6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DienMay extends HangHoa {
    private int thoiGianBH;
    private int congXuat;

    @Override
    public String danhGiaHangHoa(){
        if(super.getSoLuongTon()<3){
            return "Bán được";
        }
        return "Khó bán";
    }

    @Override
    public  void nhap()
    {
        super.setVAT(10);
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thời gian bảo hành: ");
        thoiGianBH = sc.nextInt();
        System.out.print("Nhập công xuất: ");
        congXuat= sc.nextInt();
    }
    public static void inTieuDe(){
        HangHoa.inTieuDe();
        System.out.printf("%-20s %-20s %-20s\n", "Thời gian bảo hành","Công xuất", "Mức độ bán");
    }
    @Override
    public void inDL()
    {
        super.inDL();
        System.out.printf("%-20d %-20d %-20s\n", thoiGianBH, congXuat, danhGiaHangHoa());
    }
}
class TestDienMay {
    public static void main(String[] args) {
        DienMay dienMay = new DienMay();
        dienMay.nhap();
        DienMay.inTieuDe();
        dienMay.inDL();
    }
}
