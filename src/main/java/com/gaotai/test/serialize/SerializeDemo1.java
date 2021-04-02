package com.gaotai.test.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author： hzm
 * @date： 2021/3/31 11:19
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class SerializeDemo1 {
    public static void main(String[] args) {
        Employee e = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("g:/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }

}
