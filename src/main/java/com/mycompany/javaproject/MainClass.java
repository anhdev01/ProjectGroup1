/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaproject;

/**
 *
 * @author KIM ANH
 */
public class MainClass {
    //Tim Max by DangCongTung
     public int timMax(int a , int b , int c){ 
        int max = a;
        if(a < b) max = b;
        else if( a < c) max = c;
        return max;
    }
      public int PhepCong ( int a , int b) {
         return a+b;
     }
     public int PhepTru( int a , int b)
     {
         return a-b;
     }
     public int PhepChia(int a, int b){
        return a/b;
     }
    //TimMin by NguyenVanAnh
    public int timMin(int a , int b , int c){ 
        int min = a;
        if(a > b) min = b;
        else if( a > c) min = c;
        return min;
    }
    public int PhepNhan(int a , int b){ 
       return a*b; 
    }
    public static void main(String[] args) {
        MainClass a = new MainClass();
        //Chạy code trong này
        System.out.println("Min là : "+ a.timMin(10, 22, 9));
        System.out.println("Max là : "+ a.timMax(101, 222, 19)); 
        System.out.println("Tong hai so la :" +a.PhepCong(10,6));
        System.out.println("Hieu hai so la :" +a.PhepTru(10,6));
        System.out.println("Tich hai so la :" +a.PhepNhan(5,6));
        System.out.print("Thuong hai so la:" +a.PhepChia(10, 5));
    }
    
   
}
