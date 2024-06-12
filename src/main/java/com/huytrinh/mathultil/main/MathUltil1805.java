/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.huytrinh.mathultil.main;
import com.huytrinh.mathultil.core.MathUtility;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class MathUltil1805 {

    //this method is written directly in server to simulate
        //the work of anthoer team member, he uploads code before me
    public static void SayHiFormServer(){
        
    }
        
        
        public static void main(String[] args) {
            //cách kiểm thử số 2  - giống  cách 1
            //test case 1: check 0! = 1
            int n = 0;
            long expectedResult = 1;//0!=1
            long actualResult = MathUtility.getFactorial(n);
            String mess = "0! |Expected: " + expectedResult +
                                " Actual: " + actualResult;
            JOptionPane.showMessageDialog(null, mess);
            
    }
//    public static void main(String[] args) {
//        //đây là nới chạy hàm
//        //viết các test case: bộ data đầu vào với giá trị kì vọng
//        //lát hồi so sánh với giá trị thự tế mà hàm trả về!!
//        //test case 1: n = 0 | 0! = hy vọn == 1 |thực tế chờ hàm trả về
//        int n = 0;
//        long expectValue = 1;//hy vọng 0! trả về 1
//        long actualValue;
//        actualValue = MathUtility.getFactorial(n);
//        
//        System.out.println("expectedValue: " + expectValue + " actualValue: " + actualValue);
//        
//        //test case 2: 1! ta hy vọng = 1
//        n =1;
//        expectValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("expectedValue: " + expectValue + " actualValue: " + actualValue);
//        
//         //test case 3: 5! ta hy vọng = 120
//        n =5;
//        expectValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("expectedValue: " + expectValue + " actualValue: " + actualValue);
//        
//        //test case 4: -1! ta hy vọng hàm đập vào t cái ngoại lệ
//        //do -1 ko tính đc giai thừa
//        //nén ra ngoại lệ
//        n =-1;
//        //expectValue = tung ra ngoai lẹ;
//        actualValue = MathUtility.getFactorial(n);
//        //hy vọng sẽ thấy ngoại lệ suất hiện
//        System.out.println("Check getF(-1) to see exception: " +  actualValue);
//        
//    }
//    
    
    
}
