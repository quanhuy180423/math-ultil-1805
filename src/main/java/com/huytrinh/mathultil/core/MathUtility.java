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
//        long product = 1; //biến con heo đất, biến nhân dồn, biến tiếp chiêu
        if (n <0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be bettwen 1 - 20");
        }
        if (n == 0 || n == 1 ) {
            return 1;
        }
        return n * getFactorial(n-1);
        //N! = N * (N-1)!//STACK LIFO - Last in first out
    }
}

// HỌC VỀ REGRESSION TEST - KIỂM THỬ HỒI QUY
//KIỂM THỬ LẠI NHỮNG THỨ ĐÃ TỪNG KIỂM THỬ, TẠI SAO PHẢI KÀM ĐIỀU NÀY
//LÝ OD: CODE ĐANG ỔN, MÀ KO ĐỤNG VÀO NÓ, THÌ NÓ VẪN ỔN
//      NHƯNG NẾU CÓ FIX BUG, CÓ SỬA HÀM, CÓ TỐI ƯU THUẬT TOÁN TRONG
//      TRONG HÀM, THÌ CẦN PHẢI ĐC TEST LẠI - TEST LẠI THỨ ĐÃ TỪNG TEST
//      TEST LẠI HÀM ĐÃ TỪNG TEST, ĐỂ XÁC NHẬN RẰNG NÓ CÒN NGON - CÒN
//      XANH HAY KO SAU KHI CODE ĐC SỬA

//NẾU CÓ UNIT TEST CODE (JUNIT) VIỆC TEST LẠI CODE CỰC NHANH
//CHỈ CẦN THẤY MÀU XANH CỦA CÁC JUNIT TEST CASE ĐC RUN LÀ ĐC ĐỦ
// NHANH NỮA: ĐƯA UNIT TEST LÊN GITHUB, CÀI CI SCRIPT (FILE YAML YML) VALF
//MỌI THỨ TỰ ĐỘNG BÁO XANH ĐỎ LUÔN

//LUÔN THỨ LẠI NHỮNG THỨ KIỂM THỨ GỌI LÀ TEST HỒI QUY - REGRESSION TEST
// NÊN DÙNG TỰ ĐỘNG BẰNG CÁCH XÀI UNIT TEST FRAMWORK
//NHÌN = MẮT TỪ HÀM MAIN() CÁCH TRUYỀN THỐNG LÀ KO NÊN

//5! = 1*2*3*4*5
//N! = N * (N-1)!
//CÔNG THỨ ĐỆ QUY

