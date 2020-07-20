/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static com.toan.utils.MathUtil.computeFactorial;
import static junit.framework.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;


/**
 *
 * @author Ngo Nhat Toan
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfullCases(){
        //test nuhững tình huống thành công khi chạy hàm computeFactorial()
        long expected = 120;
        long actual;
        actual = computeFactorial(5);
        assertEquals(120, actual);
        assertEquals(720, computeFactorial(6));
    }
    //@Test
    @Ignore
    public void testSuccessfullSpecticalCases(){
        //test nuhững tình huống thành công khi chạy hàm computeFactorial()
        
        assertEquals(2, computeFactorial(0));
    }
    //ngoại lệ
    //Exception ko phải là 1 con số , chuỗi để so sánh
    //hàm assertEquals() chỉ dùng để so sánh các giá trị
    //có cách chơi với Exception
//    @Test(expected = IllegalArgumentException.class)
//    public void testFailedCases(){
//        computeFactorial(-5);
//    }
    // nhớ  2 con số đặc biệt 
    //netbean 8, 1005
    //netbean 10 trở lên, 1204
    //vào tab file , vào nbproject vào build-impl.xml
}
