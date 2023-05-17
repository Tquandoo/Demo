package BTH6;

import java.util.Scanner;

public class Ngay {
    private int dd, mm, yy;

    public Ngay(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public Ngay() {

    }

    public int getDd() {
        return dd;
    }

    public int getMm() {
        return mm;
    }

    public int getYy() {
        return yy;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

    public String toString() {
        return String.format("%d/%d/%d", dd, mm, yy);
    }

    public int compare(Ngay b) {
        if (b.yy != this.yy) {
            return this.yy - b.yy;
        }
        if (b.mm != this.mm) {
            return this.yy - b.yy;
        }
        return this.dd - b.dd;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        this.dd = sc.nextInt();
        System.out.print("Nhập tháng: ");
        this.mm = sc.nextInt();
        System.out.print("Nhập năm: ");
        this.yy = sc.nextInt();
        sc.nextLine();
    }
}


    class testDate{
        public static void main(String[] args) {
            Ngay ngay1 = new Ngay(15, 1, 2023);
            Ngay ngay2 = new Ngay(15,1,2023);
            System.out.println(ngay1.compare(ngay2));
        }

}

