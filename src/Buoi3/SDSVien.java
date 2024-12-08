package Buoi3;

import java.util.*;

public class SDSVien {

    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        a.nhap();
        a.dky("LTHDT", "B+");
        System.out.println("Sinh vien a sau khi dang ky them mon LTHDT: " + a);

        Scanner sc = new Scanner(System.in);
        List<SinhVien> danhSachSinhVien = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien: ");
        int soLuongSinhVien = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soLuongSinhVien; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ": ");
            sv.nhap();
            danhSachSinhVien.add(sv);
        }

        System.out.println("\nDanh sach sinh vien bi canh bao hoc vu (DTB < 2.0):");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.dtb() < 2.0) {
                System.out.println(sv);
            }
        }

        SinhVien svMaxDTB = danhSachSinhVien.get(0);
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.dtb() > svMaxDTB.dtb()) {
                svMaxDTB = sv;
            }
        }
        System.out.println("\nSinh vien co diem trung binh cao nhat: ");
        System.out.println(svMaxDTB);

        Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.layTen().compareTo(sv2.layTen());
            }
        });

        System.out.println("\nDanh sach sinh vien sau khi sap xep theo ten:");
        for (SinhVien sv : danhSachSinhVien) {
            System.out.println(sv);
        }

        sc.close();
    }
}
