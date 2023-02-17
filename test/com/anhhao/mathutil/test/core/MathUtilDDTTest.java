/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.anhhao.mathutil.test.core;

import com.anhhao.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HP
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //trả về mảng 2 chiều gồm nhiều cặp Expected|input.
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {5, 120},
            
        };
    }
    @Parameterized.Parameter(value = 0) //Value= 0 map với mảng data
    public int n; //biến map với value của cột 0 của mảng.
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected ,MathUtil.getFactorial(n));
        
    }
    
}
