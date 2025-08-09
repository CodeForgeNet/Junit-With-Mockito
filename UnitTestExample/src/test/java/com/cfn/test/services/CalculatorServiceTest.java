package com.cfn.test.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {


    int counter = 0;

//TODO: If we have some work to do before the running the test cases then we have annotation i.e; @BeforeClass (This annotation used to help executing the  logic before the testcases).

    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases");
        System.out.println("Started time : "+ new Date());
        // Let here we open any connection or file, then we have to close it also with the help of @AfterClass : do it in last(i.e; cleanup code).
    }

//TODO: If we have to execute any logic before each test case (means this logic or method run before running any test case and for all test cases) then we use @Before :

    @Before
    public void beforeEach(){
        System.out.println("Before each test case");
        counter=0;
    }


//    @Test(timeout = 2000) -> if a test case takes time more than 2000 ms then it failed.
    //    Test methods of addTwoNumbers
    @Test
    public void addTwoNumbersTest() {

        for(int i=1; i<=100; i++){
            counter+=i;
        }

        System.out.println("Test for addTwoNumbersTest");
        int result = CalculatorService.addTwoNumbers(12, 28);
        int expected = 40;
        System.out.println("Counter int first test : "+counter);
        Assert.assertEquals(expected, result);

        // Actual result
        // Expected result
    }


    @Test
    public void sumAnyNumbersTest() {

        for(int i=1; i<=20; i++){
            counter+=i;
        }

        System.out.println("Test for sumAnyNumbersTest");
        int result = CalculatorService.sumAnyNumbers(4, 6, 2, 7, 9);
        int expectedResult = 28;
        System.out.println("Counter int second test : "+counter);
        Assert.assertEquals(expectedResult, result);
    }


    @AfterClass
    public static void cleanUp(){
        System.out.println("After all test cases");
        System.out.println("Test End time : "+ new Date());
    }

}
