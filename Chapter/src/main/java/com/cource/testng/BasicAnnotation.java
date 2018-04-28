package com.cource.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    //testNG最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("这是测试1");
    }
    @BeforeMethod
    public void beforeMehod(){
            System.out.println();
        }


}
