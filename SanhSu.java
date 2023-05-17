package BTH6;

import java.util.Scanner;

public class SanhSu extends HangHoa {
    private  String NSX;
    private  Ngay ngayNhapKho;


    public String danhGiaHangHoa(){
        if(super.getSoLuongTon()>50){
            return "Bán chậm";
        }
        return "Khó bán";
    }

    public void nhap(){
        super.setVAT(10);
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày sản xuất: ");
        NSX=sc.nextLine();
        System.out.println("Ngày nhập kho: ");
        ngayNhapKho = new Ngay();
        ngayNhapKho.nhap();
    }
    public static void inTieuDe(){
        HangHoa.inTieuDe();
        System.out.printf("%-20s %-20s %-20s \n ", "Ngày sản xuất", "Ngày nhập kho", "Mức độ bán");
    }
    public void inDL()
    {
        super.inDL();
        System.out.printf("%-20s %-20s %-20s\n", NSX, ngayNhapKho, danhGiaHangHoa());
    }

}
