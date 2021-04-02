package com.gaotai; /**
 * @author： hzm
 * @date： 2021/2/18 14:38
 * @description： TODO
 * @modifiedBy：
 * @version:
 */

import com.gaotai.controller.StudentController;
import com.gaotai.dao.StudengDao;
import com.gaotai.dao.lmpl.StudengDaoImpl;
import com.gaotai.entity.StudentEntity;
import com.gaotai.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //HelloWorld obj = (HelloWorld) context.getBean("hello");
        StudentService studentService = (StudentService) context.getBean("studentServiceImpl");
        studentService.show();

        StudentController studentController = (StudentController) context.getBean("stuCont");
        studentController.show();
        StudengDao studengDao = (StudengDao) context.getBean("studengDaoImpl");
        studengDao.show();
        studengDao.showStudent();
        studengDao.add();
        StudengDaoImpl iml = new StudengDaoImpl();
        iml.add();


        StudentEntity studentEntity = (StudentEntity) context.getBean("studentEntity");
        System.out.println(studentEntity.toString());
    }
}
