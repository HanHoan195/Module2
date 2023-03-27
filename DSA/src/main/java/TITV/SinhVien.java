package TITV;

public class SinhVien implements Comparable<SinhVien> {
    private String maSinhvien;
    private String hoVaTen;
    private int namSinh ;
    private float diemTrungBinh;



    //constructor

    public SinhVien(String maSinhvien) {
        this.maSinhvien = maSinhvien;
    }

    public SinhVien(String maSinhvien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhvien = maSinhvien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    //getetr setter


    public String getMaSinhvien() {
        return maSinhvien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setMaSinhvien(String maSinhvien) {
        this.maSinhvien = maSinhvien;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "MSV: '" + maSinhvien + '\'' +
                ", HoVaTen: '" + hoVaTen + '\'' +
                ", NamSinh: " + namSinh +
                ", DiemTrungBinh: " + diemTrungBinh +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhvien.compareTo(o.maSinhvien);
    }
}
