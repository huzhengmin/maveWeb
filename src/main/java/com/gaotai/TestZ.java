package com.gaotai;

import org.aspectj.weaver.ast.Test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author： hzm
 * @date： 2021/2/26 9:46
 * @description： TODO
 * @modifiedBy：
 * @version:
 */

@testA(id=1,msg="江")
public class TestZ {
    public void msg()
    {
        boolean hasAnnotation = TestZ.class.isAnnotationPresent(testA.class);
        if(hasAnnotation){
            testA testAnnotation = TestZ.class.getAnnotation(testA.class);
            System.out.println("id:" );
            System.out.println("id:"+testAnnotation.id());
            System.out.println("msg:"+testAnnotation.msg());
        }
    }
    @Override
    public String toString() {


        return "TestZ{}";
    }
}
