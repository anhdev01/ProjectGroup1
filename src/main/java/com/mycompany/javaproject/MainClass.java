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
    //TimMin by NguyenVanAnh
    public int timMin(int a , int b , int c){ 
        int min = a;
        if(a > b) min = b;
        else if( a > c) min = c;
        return min;
    }
    //Test
    public static void main(String[] args) {
        MainClass a = new MainClass();
        //Chạy code trong này
        System.out.println("Min là : "+ a.timMin(10, 22, 9));
    }
}
