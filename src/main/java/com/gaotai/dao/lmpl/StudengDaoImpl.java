package com.gaotai.dao.lmpl;

import com.gaotai.dao.StudengDao;
import com.gaotai.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

/**
 * @author： hzm
 * @date： 2021/3/2 9:52
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
@Repository
public class StudengDaoImpl implements StudengDao {
    @Override
    public void show() {
        System.out.println("StudengDaoImpl ->SHOW()");
    }

    @Override
    public void showStudent() {
        StudentEntity stu = new StudentEntity();
        System.out.println(stu);
    }
    @Override
    public void add(){}
}
