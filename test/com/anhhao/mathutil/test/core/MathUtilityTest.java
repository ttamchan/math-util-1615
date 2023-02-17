/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anhhao.mathutil.test.core;

import com.anhhao.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



public class MathUtilityTest {
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(1 ,MathUtil.getFactorial(1));
        Assert.assertEquals(2 ,MathUtil.getFactorial(2));
        Assert.assertEquals(6 ,MathUtil.getFactorial(3));
        Assert.assertEquals(24 ,MathUtil.getFactorial(4));
        Assert.assertEquals(120 ,MathUtil.getFactorial(5));
        Assert.assertEquals(720 ,MathUtil.getFactorial(6));
        
    }
    
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5);
//        
//    } //fail
    
    @Test (expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
        
    } //C1
    
    //cách khác bắt ngoại lệ xuất hiện / use Lambda
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
        //MathUtil.getFactorial(-5); 
        
    }
    
    //bắt ngoại lệ xem hàm có ném về ngoại lệ hay ko khi n sai
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(-5);
            
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
            
            
        }
        
        
    }
    
    
}
