import com.gaotai.HelloWorld;
import com.gaotai.controller.*;
import com.gaotai.TestZ;
import com.gaotai.controller.StudentController;
import com.gaotai.service.StudentService;
import com.gaotai.service.lmpl.StudentServiceImpl;
import com.gaotai.testA;
import com.gaotai.util.Log4JUtils;
import com.gaotai.util.MyUtil;
import com.sun.deploy.util.StringUtils;
import com.sun.javafx.collections.MappingChange;
import jdk.management.resource.ResourceType;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.*;

import java.util.*;
import java.util.zip.CheckedOutputStream;

/**
 * @author： hzm
 * @date： 2021/2/18 15:06
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class Test {
    @org.junit.Test
    public void Test_0()
    {

        System.out.println(new MyUtil().getStr(new Date()));
        System.out.println(new MyUtil().getStr("Hello word"));
    }

    @org.junit.Test
    public void main1() {
        System.out.println("dddd");

    }

    @org.junit.Test
    public void ListTest() {
        List<String> listStr = new ArrayList();
        for (Integer i = 0; i < 10; i++) {
            listStr.add(i.toString() + "A");
        }
        for (Object str : listStr) {
            System.out.println(str);
        }
        Iterator<String> it1 = listStr.iterator();
        while(it1.hasNext()) {
            String str1 = it1.next();
            System.out.println("-->"+str1);
        }

    }

    @org.junit.Test
    public void ints() {
//        String[] ints = new String[10];
//        for (int i = 0; i < 10; i++) {
//            ints[i] = i + "A";
//        }
//        for (String i : ints) {
//            System.out.println(i);
//        }
//        List<String> listInt = Arrays.asList(ints);
//        System.out.println(listInt);
//        Integer[] ints = new Integer[10];
//        for (int i = 0; i < 10; i++) {
//            ints[i] = i  ;
//        }
//        for (Integer i : ints) {
//            System.out.println(i);
//        }
//        List<Integer> listInt = Arrays.asList(ints);
//        System.out.println(listInt);
        List<String> list=new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("cow");
        String[] animals=list.toArray(new String[0]);

        for(String animal:animals){
            System.out.println(animal);
        }
        System.out.println( StringUtils.join(list, ":"));
    }
    @org.junit.Test
    public void setTemp()
    {
        Set set = new HashSet();
        System.out.println( StringUtils.join(set, "_"));
        set.add("1");
        System.out.println( StringUtils.join(set, "_"));
        set.add("12");
        System.out.println( StringUtils.join(set, "_"));
        set.add("1");
        System.out.println( StringUtils.join(set, "_"));


    }
    @org.junit.Test
    public void mapTemp()
    {
        /**
         * 最常见也是大多数情况下用的最多的，一般在键值对都需要使用
         */
        Map <String,String>map = new HashMap<String,String>();
        map.put("熊大", "棕色");
        map.put("熊二", "黄色");
//        for(Map.Entry<String, String> entry : map.entrySet()){
//            String mapKey = entry.getKey();
//            String mapValue = entry.getValue();
//            System.out.println(mapKey+":"+mapValue);
//        }
         for (String key:map.keySet())
         {
             System.out.println(key);
         }
    }
    @org.junit.Test
    public void test()
    {
        new StudentController().hello();
    }
    @org.junit.Test
    public void testZ()
    {


        Arrays.asList("a","b","c").forEach(e->System.out.println(e));


    }
    @org.junit.Test
    public void test0()
    {
//        int i=1,a=0;
//       // System.out.println("a=i++===>  "+(a=i++));//1
//         System.out.println("a=++i===>  "+(a=++i));//2
        int x=0;
        int y=0;
        x= ++x;
        y =y++;
        System.out.println(x);
        System.out.println(y);
    }
    @org.junit.Test
    public void test1()
    {
//        StudentService studentService = new StudentServiceImpl();
//        studentService.show();
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        StudentService obj = (StudentService) context.getBean("studentServiceImpl");
        obj.show();
    }
    @org.junit.Test
    public void test2()
    {
        Integer x = 100; // x里面并不是保存100，保存的是100这个对象的内存地址。
        Integer y = 100;
        System.out.println(x == y); // true

        Integer x1 = 128;
        Integer y1 = 128;
        System.out.println(x1.intValue() == y1.intValue()); // false
        int []arr={1,2};
        for(int i:arr)
        {
            System.out.println(i);
        }
        List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            list.add(i+"a");
        }
        for (String s :list)
        {
            System.out.println(s);

        }
        Iterator<String> iterator = list.listIterator();
        System.out.println("ddddd");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    @org.junit.Test
    public void SetTemp()
    {
        Set<String> set = new HashSet<>();
        for(int i=0;i<5;i++)
        {
            set.add(i+"");
        }
        for(String s:set)
        {
            System.out.println(s);
        }

    }
    @org.junit.Test
    public void testLog()
    {
        Log4JUtils.logDebug("ERROR:100");
    }
    @org.junit.Test
    public  void test01(){
        Object o;
        String s1 = new String() ;
        String s2 = new String();
        System.out.println(s1.equals(s2));
        s1 = "aaaaaaaaaa01";
        s2 = "02";
        System.out.println(s1.equals(s2));
        s2="aaaaaaaaaa010";
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode()+"-->"+s2.hashCode());
        System.out.println(new EnumTest().getClass());
    }
}
