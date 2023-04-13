// Bai 1 + 2 +3 + 4 ,tất cả trong 1
import java.util.Scanner;

public class SanPham {
    public String tenSP;
    public double donGia;
    public double giamGia;


    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSp, double donGia){ 
        this(tenSp, donGia, 0) ;
        } 
        

    private double getThueNhapKhau(double donGia){
        return 0.1*donGia;
    }
    public void xuat(){
        System.out.print("Ten san pham : "+tenSP+" , Don gia : "+donGia + " , Giam gia :"+giamGia+ " , Thue nhap khau : "+getThueNhapKhau(donGia)+"\n");
    }
    Scanner input= new Scanner(System.in);
    public void nhap(){
        System.out.print(" Nhap ten san pham : ");
        tenSP = input.next();
        System.out.print(" Nhap don gia : ");
        donGia = input.nextDouble();
        System.out.print(" Nhap giam gia : ");
        giamGia = input.nextDouble();
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public static void main(String[] args){
        SanPham sp1 = new SanPham(null, 0, 0);
        sp1.nhap();
        sp1.xuat();
        SanPham sp2 = new SanPham(null, 0, 0);
        sp2.nhap();
        sp2.xuat();

        SanPham sp3 = new SanPham(null, 0);
        sp3.nhap();
        sp3.setGiamGia(0);
        sp3.xuat();
        SanPham sp4 = new SanPham(null, 0);
        sp4.nhap();
        sp4.setGiamGia(0);
        sp4.xuat();

    }
}
