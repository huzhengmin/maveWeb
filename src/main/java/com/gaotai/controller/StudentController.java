package com.gaotai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author： hzm
 * @date： 2021/3/2 9:57
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
@RequestMapping("/springmvc")
@Controller(value = "stuCont")
public class StudentController {
    public void show()
    {
        System.out.println("StudentController->SHOW()");
    }
    @RequestMapping("/test")
    public String hello() {
        System.out.println("hello world");
        return "success";
    }

}
