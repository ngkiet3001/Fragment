package com.example.test_fragment;

public class SinhVien {
    private int Hinh;
    private String ten;
    private int tuoi;

    public SinhVien(int hinh, String ten, int tuoi) {
        Hinh = hinh;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "Hinh=" + Hinh +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
