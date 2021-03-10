package com.gaotai.service.lmpl;

import com.gaotai.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author： hzm
 * @date： 2021/3/2 9:40
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void show() {
        System.out.println("StudentServiceImpl SHOW()");
    }

    @Override
    public void fly() {
        System.out.println("stufly");
    }
}
