/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huytrinh.mathutil.core.test;

import com.huytrinh.mathultil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {

    //CHUẨN BỊ DATA SAU NÀY ĐƯA VÀO HÀM ASSERT() CỦA FRAMEWORK
    //DATA NÀY SẼ TỪ TỪ ĐC TRÍCH VÀO TRONG HÀM assert()
    //no nằm trong hàm có style là static - nằm cố định ở 1 vùng ram
    //test case
    //0! -> 1
    //1! = 1
    //2! = 2
    //3! = 6
    //4! = 24
    //5! = 120
    //6! = 720
    //ta thấy có các nộ data
    // {0,1}, {1,1}, {2,2}, {3,6}, {4,24}, {5,120}, {6,720}...
    //      [7][2]
    //ta thấy để riêng data này ra 1 mảng 2 chiều
    public static Object[][] initData() {
        return new Object[][]
        {
            {0, 1}, 
            {1, 1}, 
            {2, 2}, 
            {3, 6}, 
            {4, 24}, 
            {5, 120}, 
            {6, 720}
        };
        
    }
    
    //test case so sánh hàm có trả vè kì vọng hay ko
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgReturnWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n) );
    }

}

