package BTH6;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHangHoa {
    static HangHoa danhsachHang[];
    static int n;

    public static void nhapHangHoa(){
        int chon, i=0, j =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng hàng hóa: ");
        n=sc.nextInt();
        danhsachHang = new HangHoa[n];
        do{
            System.out.println("Nhập:  1- Điện máy; 2- Sành Sứ; 3- Thực phẩm;");
            System.out.print("Nhập lựa chọn của bạn: ");
            chon = sc.nextInt();
            HangHoa h;
            if(chon==1){
                h = new DienMay();
            }
            else if (chon == 2){
                h= new SanhSu();
            }
            else{
                h= new hangThucPham();
            }
            h.nhap();
            for( j=0; j<i; j++)
            {
                if(h.getMaHang().equalsIgnoreCase(danhsachHang[j].getMaHang())){
                    System.out.println("Hàng đã tồn tại!");
                    break;
                }
            }
            if(i==j){
                danhsachHang[i]=h;
                i=i+1;
            }
        }
        while(i<n);
    }

    public  static  void inHangHoa() {
        System.out.println("-----------------Danh sách hàng Sành Sứ-------------------");
        SanhSu.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (danhsachHang[i] instanceof SanhSu) {
                danhsachHang[i].inDL();
            }
        }
        System.out.println("----------------Dabg sách hàng Điện Lạnh------------------");
        DienMay.inTieuDe();
        for(int i=0; i<n; i++){
            if(danhsachHang[i] instanceof DienMay){
                danhsachHang[i].inDL();
            }
        }
        System.out.println("----------------Dabg sách hàng Thực Phẩm------------------");
        hangThucPham.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (danhsachHang[i] instanceof hangThucPham) {
                danhsachHang[i].inDL();
            }
        }
    }

    public static void main(String[] args) {
        nhapHangHoa();
        inHangHoa();
    }
}
