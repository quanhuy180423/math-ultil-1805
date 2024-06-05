/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huytrinh.mathutil.core.test;

import com.huytrinh.mathultil.core.MathUtility;
import com.huytrinh.mathultil.main.MathUltil1805;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//quy ước đặt tên package của java
//tên miền đảo ngược, chữ thường 100%
//com.mycompany trên mạng
//com.tên-cty.tên-dự-án.tên-module.tên-class-sẽ dùng
//com.mircosoft.sqlserver.jdbc

//maven ko chỉ là kỷ thuộc viết code
//biến môi trường là khai báo trc các biến cần tìm

//c# viết chiều xuôi, chữ hoa từng đầu từ
//Microsoft
//thư viện cho phép viết ở đâu cũng đc
//framword bắt phải viết theo khung, 
//frameword như thư viện nhưng thư viện ko phải frameword
/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    //ở đây chứ các lệnh các hàm dùng để đi test hàm chính ở bên code chính
    //ở bên thư mục source phía trên coi hàm chạy ổn ko
    //ở đây ta làm các hàm ugws với cá test case để test code chính ở bên
    //Mathutility. ví dụ .getFactorial()
    //TEST CASE: BỘ DATA ĐƯA HÀM VÀO, APP VỀ VERIFY HÀM, APP CÓ XỬ LÍ
    //ĐÚNG HAY KO, NÓ ĐI KÈM THEO CÁCH XÀI HÀM, TRÌNH TỰ XÀI APP + EXPECTED
    //VALUE + STATUS TEST CASE PASSED HAY FAILDE
    //TEST CASE #1: CHECK GETFATORIAL() UIWTH N =0, 0!
    //HOPE TO SEE 1 RETURNED
    @Test
    //tên hàm mang ý nghĩa của test case luôn
    public void testFatorialGivenRightArg0ReturnsWell() {
        int n = 0; //given right argument
        long expectedValue = 1;//hy vọng n! 0! => 1
        long actualValue; // == value? đoán xem trả về mấy
        //nếu expected == actual, hàm ngon với case này

        actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedValue, actualValue);
        //cách cũ là phải  sout() từng cais 1 bà dùng mắt để nhìn đúng sai

    }

    //TEST CASER #2: CHECK GETFATORIAL WITH N = 1, EXPECTED => 1! = 1
    @Test
    public void testFatorialGivenRightArg1ReturnWell() {
        int n = 1;
        long expectedValue = 1; //1 gia thừa = 1
        long actualValue; //= ??? // chờ xem hàm
        actualValue = MathUtility.getFactorial(n);

        assertEquals(actualValue, expectedValue);

    }

    //TEST CASER #3: CHECK GETFATORIAL WITH N = 2, EXPECTED => 2! = 2
    //                                      N = 3, EXPECTED => 3! = 6
    //                                      N = 5, EXPECTED => 5! = 120
    @Test
    public void testFatorialGivenRightArg234ReturnWell() {
        int n = 2;
        long expectedValue = 2; //2 gia thừa = 2
        long actualValue; //= ??? // chờ xem hàm
        actualValue = MathUtility.getFactorial(n);
        
        assertEquals(expectedValue, actualValue);//2!
        assertEquals(6, MathUtility.getFactorial(3));//3!
        assertEquals(120, MathUtility.getFactorial(5));//6!
    }
    
    //TEST 4: CHECK IF GETFATORIAL RETURN EXCEPTION IF WE PASS N < 0
    @Test
    public void testFatorialGivenWrongArg_1ThrowException(){
        //INPUT N < 0, N = -1
       //EXCEPTED RESULT: ILLEGAL ARGUMENT EXCEPTION
       //NHỚ QUY ƯỚC: MÀU xanh ứng với trả về như kỳ vọng
       //màu đỏ: actual != kì vọng 
       //Ngoại lê exception ko là value, ta ko khai báo biến để  = ngoại lệ
       //ko assertEquals(value value value)
        assertThrows(IllegalArgumentException.class, 
                () -> {MathUtility.getFactorial(-1);} );
        
    }
}


//PHẦN KIẾN THỨC BỔ SUNG VÀO CV 
//TDD  - TEST DRIVEN DEVELOPMENT
//LÀ KỸ THUẬT VIẾT APP, CODE CỦA DẤN DEV ĐI KÈM ĐI VỚI CÁC TEST CASE ĐỂ KIỂM THỬ NGAY
//CÁC CODE MÌNH VỪA VIẾT
//TỨ LÀ CODE CỦA MỐI HÀM LUN ĐI KÈM CODE KIỂM THỬ 
//KẾT QUẢ KIỂM THỬ HIỂN THỊ THEO 2 MÀU XANH CODE NGON PASS TEST CASE
//MÀU ĐỔ CODE DDAAX KO PASS TEST CASE
//VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST
//CASE ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDDD

//MỌI NGÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORK GIÚP
//TEST CODE 2 MÀU XANH ĐỔ, GOI LÀ UNIT TESTING FRAME WORK
//MỌI NGÔN NGỮ ĐỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY KO
//VD: NHÓM LÀM OBS CÓ SÀI

//ĐỀ BÀI THUYẾT TRÌNH NHÓM
//NHÓM HÃY CHỌN UNIT TESTING FRAMEWORK ĐỂ DEMO
//VÀO GG GÕ: UNIT TESING FRAMEWORK FOR <NNLT>, RA KQ THƯ VIỆN
//C#: NUNIT,XUNIT, MS TEST
//JAVA: TESING...
//JS MOCHA, JASMINE....

//DÒNG THỨ 2 TRONG CV
//DDT - DATA DRIVEN TESTING | TỪ TƯƠNG ĐƯƠNG
//                              PARAMETERZIED TESING
//                        VIẾT TEST CASE THEO STYLE THAM SỐ HÓA

//(ĐỪNG NHẦM VS TDD -TEST DRIVEN DEVELOPMENT)
//DDT LÀ PHẦN MỞ RỘNG THÊM, KĨ THUẬT NÂNG CAO ĐỂ GIÚP TỎ CHỨC
//CÁC TEST CASE KHI VIẾT CODE UNIT TEST. NÓ CÓ BÀ CON VỚI TDD

//DDT - PARAMETERIZED TESTING LÀ Ĩ THUẬT VIẾT CÁC TEST CASE
// MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH ASSERT()
//CHO DỄ QUẢN LÍ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
//DỄ THEO DỖI CÁC PHẦN CODE LIÊN QUAN ĐẾN TEST HÀM
//VÌ CÂU LỆNH SÓ SÁNH EXPECTED VS. ACTUAL TRỞ NÊN GỌN NHẸ HƠN

