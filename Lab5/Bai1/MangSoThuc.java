package Lab5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class MangSoThuc {
    private ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc");
        while (true) {
            System.out.print("Nhap so: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.print("Nhap tiep du lieu (Y/N): ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void hienThi() {
        for (Double item : list) {
            System.out.print(" " + item);
        }
    }

    public void tinhTong() {
        double tong = 0;
        for (Double item : list) {
            tong += item;
        }
        System.out.println();
        System.out.println("Tong: " + tong);
    }
}
