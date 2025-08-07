package com.cfn.test.services;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

//    Test methods of addTwoNumbers
    @Test
    public void addTwoNumbersTest(){
        int result = CalculatorService.addTwoNumbers(12,28);
        int expected=40;
        Assert.assertEquals(expected,result);

        // Actual result
        // Expected result
    }


    @Test
    public void sumAnyNumbersTest(){
        int result = CalculatorService.sumAnyNumbers(4,6,2,7,9);
        int expectedResult=28;
        Assert.assertEquals(expectedResult,result);
    }

}
