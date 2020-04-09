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
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StudentMng a = new StudentMng();
        
        while(true){
        System.out.println("1.Them\n2.sua\n3.xoa\n4.hien thi sinh vien\n5.tim kiem\n6.sap xep theo tong diem 3 mon\n7.ket thuc");
        int input=sc.nextInt();
        switch (input){
            case 1:
                Student b = new Student();
                b.nhap();
                if(a.add(b)){
                    System.out.println("Successful");
                }else{
                    System.out.println("fail");
                }
                break;
            case 2:
                System.out.println("nhap mssv muon sua");
                String s= new String();
                s=sc.next();
                a.sua(s);
                break;
            case 3:
                System.out.println("nhap mssv muon sua");
                String g = new String();
                g=sc.next();
                if(a.delete(g))
                {
                   System.out.println("Successful");
                }else{
                    System.out.println("fail");
                }
                break;
                
            case 4:
                a.show();
                break;
            case 5:
                System.out.println("nhap MSSV muon tim");
                String k = sc.next();
                if(a.tim(k))
                {
                    System.out.println("");
                }
                else{
                    System.out.println("k co thong tinsv");
                }
            case 6:
                a.sapsep();
                break;
            case 7:
                return;
        }
    }
    }
    
}
