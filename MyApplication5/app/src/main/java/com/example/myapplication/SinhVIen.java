package com.example.myapplication;

public class SinhVIen {
    private String hoten,mssv;
    private int gioitinh;

    public SinhVIen(String hoten, String mssv, int gioitinh) {
        this.hoten = hoten;
        this.mssv = mssv;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }
}
