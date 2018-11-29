package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject5eu0 {

        Project5eu0Delegate project5eu0Delegate = new Project5eu0Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project5eu0Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}