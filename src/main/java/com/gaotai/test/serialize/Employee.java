package com.gaotai.test.serialize;

import java.io.Serializable;

/**
 * @author： hzm
 * @date： 2021/3/31 11:13
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Employee  implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
