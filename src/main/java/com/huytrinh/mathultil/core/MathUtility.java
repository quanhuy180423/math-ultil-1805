/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huytrinh.mathultil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    
    //ta sẽ viết những hàm toán học cung cấp các tiện ích cho bên ngoài sử dụng
    //giống như cái thư viện Math. của jdk
    //các hàm mang ý nghĩa tiện ích dùng chung cho nhiều noiwthif sẽ đc thiết
    //kế là static!!!
    //static sẽ đc gọi trực tiếp qua tên class
    
    //hàm tính  n! = 1.2.3.4.5..n
    //n:0..20; do 21! trang kiểu long, ko có âm gia thừa
    // 0! = 1
    public static long getFactorial(int n){
        long product = 1; //biến con heo đất, biến nhân dồn, biến tiếp chiêu
        if (n <0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be bettwen 1 - 20");
        }
        if (n ==0 ) {
            return 1;
        }
        //n = 1,2,3,4...20
        for (int i = 1; i <= n; i++) {
            product *= i;//product = product * i
            
        }
        return product;
    }
}
