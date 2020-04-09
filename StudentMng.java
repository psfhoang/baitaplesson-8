/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class StudentMng {
    Scanner sc = new Scanner(System.in);

    ArrayList<Student> array = new ArrayList<>();
    ArrayList<Student> clone= new ArrayList<>();

    public boolean add(Student a) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getMssv().equals(a.getMssv())) {
                return false;
            }
        }
        array.add(a);
        return true;
    }
    public void show()
    {
        for(int i=0;i<array.size();i++)
        {
           array.get(i).xuat();
        }
    }

    public boolean delete(String MSSV) {
        int q = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getMssv().equals(MSSV)) {
                q = i;
            }
        }
        if (q >= 0) {
            array.remove(q);
            return true;
        }
        return false;
    }

    public void sua(String MSSV) {
        int q = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getMssv().equals(MSSV)) {
                q = i;
            }

        }
        System.out.println(q);
        if (q >= 0) {
            while (true) {
                System.out.println("ban muon sua gi");
                System.out.println("1.ten\t 2.tuoi \t 3.mssv\t4.break");
                int input = sc.nextInt();
                switch (input){
                    case 1:
                        System.out.println("moi ban nhap ten moi");
                        array.get(q).setTen(sc.next());
                        break;
                    case 2:
                        System.out.println("nhap tuoi ban muon sua");
                        array.get(q).setTuoi(sc.next());
                        break;
                    case 3:
                        System.out.println("nhap mssv ban muon sua");
                        array.get(q).setMssv(sc.next());
                        break;
                    case 4:
                        return;
                }
            }
            
        }else{
            System.out.println("k co thi sinh nao");
        }
            

    }
    public boolean tim(String MSSV)
    {
        int a =-1;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getMssv().equals(a))
                a=i;
            
        }
        if(a>=0)
        {
            array.get(a).xuat();
            return true;
        }
        return false;
    }
    public void sapsep()
    {
        Student a = new Student();
        clone = (ArrayList<Student>) array.clone();
        for (int i = 0; i < clone.size()-1; i++) {
            for (int j = i+1; j < clone.size(); j++) {
                if(clone.get(i).tongdiem()<clone.get(i+1).tongdiem()){
                    a=clone.get(i);
                    clone.set(i,clone.get(j));
                    clone.set(j,a);
                }
            }
            
        }
        for (int i = 0; i < clone.size(); i++) {
            clone.get(i).xuat();
        }
              
    }   
    

}
