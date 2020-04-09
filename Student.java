/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class Student {
    private String mssv,ten,tuoi;
    int nam,nu;
    private int toan,van,anh;
    
    Scanner sc = new Scanner(System.in);

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public void setVan(int van) {
        this.van = van;
    }

    public int getToan() {
        return toan;
    }

    public int getVan() {
        return van;
    }

    public int getAnh() {
        return anh;
    }
    public int tongdiem()
    {
        return getAnh()+getVan()+getToan();
    }
    public void nhap()
    {
        System.out.println("nhap ten sv");
        setTen(sc.next());
        System.out.println("nhap tuoi sv");
        setTuoi(sc.next());
        System.out.println("nhap mssv");
        setMssv(sc.next());
        System.out.println("nhap diem toan van anh");
        setToan(sc.nextInt());
        setVan(sc.nextInt());
        setAnh(sc.nextInt());
    }
    public void xuat()
    {
        System.out.println("ten :"+getTen());
        System.out.println("tuoi :"+getTuoi());
        System.out.println("mssv:"+getMssv());
        System.out.println("diem toan , van , anh"+tongdiem());
    }
    
            
    
    
}
