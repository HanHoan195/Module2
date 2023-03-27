package TITV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhsach;

    public DanhSachSinhVien(){
        this.danhsach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    //thêm sv và ds
    public void themSinhVien (SinhVien sv){
        this.danhsach.add(sv);
    }

    //in dssv
    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien : danhsach ) {
            System.out.println(sinhVien);
        }
    }

    //kiểm tra ds rỗng hay ko
    public boolean kiemTraDanhSachRong(){
       return this.danhsach.isEmpty();
    }

    //lấy ra số lượng trong ds
    public int soLuongSinhVien(){
        return this.danhsach.size();
    }

    //lm rỗng dssv
    public void lmRongDanhSach(){
        this.danhsach.removeAll(danhsach);
    }
        //kiểm tra sv theo mã sv
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhsach.contains(sv);
    }

    //xóa sv
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhsach.remove(sv);
    }

    //tìm sv dựa trên tên
    public void timSinhVien (String ten){
        for (SinhVien sinhVien : danhsach){
            if(sinhVien.getHoVaTen().indexOf(ten)>=0){
                System.out.println(sinhVien);
            }
        }
    }
    //xuât ra điểm từ thấp đến cao
    public void sapXepDiem(){
        Collections.sort(this.danhsach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
               if (sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                   return 1;
               } else if (sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
                   return -1;
               } else {
                   return 0;
               }
            }
        });
    }
}
