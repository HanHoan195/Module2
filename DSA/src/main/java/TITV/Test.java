package TITV;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv= new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("--------MENU-------");
            System.out.println(
                 "1. Thêm sv vào ds.\n"
                 +"2.In danh sách Sinh Viên.\n"
                 +"3.Kiểm tra ds.\n"
                 +"4.Lấy ra số lượng SV.\n"
                 +"5.Làm rỗng ds.\n"
                 +"6.Kiểm tra dựa trên mã SV.\n"
                 +"7.Xóa SV.\n"
                 +"8.Tìm kiếm SV dựa trên tên.\n"
                 +"9.Xuất ra ds SV có điểm từ cao đến thấp.\n"
                 +""
                 +"0.Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng:");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon == 1){//thêm sv
                System.out.println("Nhập mã SV:");
                String maSinhVien = sc.nextLine();

                System.out.println("Nhập họ và tên SV:");
                String hoVaTen = sc.nextLine();

                System.out.println("Nhập năm sinh:");
                int namSinh  = sc.nextInt();

                System.out.println("Nhập điểm trung bình:");
                float diemTrungBinh = sc.nextFloat();

                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            } else if(luaChon == 2){//in ds ra màn hình
                dssv.inDanhSachSinhVien();

            } else if(luaChon == 3){//kiểm tra dssv
                System.out.println("Danh sách rỗng? " + dssv.kiemTraDanhSachRong());

            } else if(luaChon == 4){//lấy ra số lượng sv
                System.out.println("Số lượng hiện tại: " + dssv.soLuongSinhVien());

            } else if(luaChon == 5){// lm rỗng danh sach
                dssv.lmRongDanhSach();
                System.out.println("Đã xóa DS.");

            } else if(luaChon == 6){//kiểm tra sv có hay không theo mã
                System.out.println("Nhập mã SV:");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiểm tra sinh viên có trong ds: " + dssv.kiemTraTonTai(sv));

            } else if(luaChon == 7){//xóa sv theo mã
                System.out.println("Nhập mã SV:");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xóa sinh viên trong ds: " + dssv.xoaSinhVien(sv));

            } else if(luaChon == 8){//tìm kiếm sv
                System.out.println("Nhập họ và tên;");
                String hoVaTen = sc.nextLine();
                System.out.println("Kết quả tìm kiếm:");
                dssv.timSinhVien(hoVaTen);

            } else if(luaChon == 9){//xuất ra danh sách sv theo điểm
                dssv.sapXepDiem();
                dssv.inDanhSachSinhVien();

            }
        } while (luaChon != 0);
    }
}
