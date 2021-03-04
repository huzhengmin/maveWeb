import com.gaotai.Student;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author： hzm
 * @date： 2021/2/24 9:58
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class SetTemp {
    @Test
    public void tem1()
    {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(2);
        hs.add(3);
        System.out.println(hs.add(4));
        System.out.println(hs.add(4));  //检验HashSet是否允许重复元素加入
        System.out.println(hs);    //检验HashSet是否有序

        for (Integer i :hs)
        {
            System.out.println(i);
        }
    }
    @Test
    public void temp2()
    {
        HashSet<Student> hs = new HashSet<>();

        hs.add(new Student("yiyi",1));
        hs.add(new Student("feifei",2));
        hs.add(new Student("lili",3));

        System.out.println(hs.add(new Student("wawa",4)));
        System.out.println(hs.add(new Student("wawa",4)));
        System.out.println("------------第一种打印方式，利用重写的toString（）方法和Println（）直接打印");
        System.out.println(hs);  //第一种打印方式，利用重写的toString（）方法和Println（）直接打印
        System.out.println("------------第二种打印方式，增强for循环");
        for(Student s : hs) {   //第二种打印方式，增强for循环
            System.out.println(s);
        }
        System.out.println("------------第三种打印方式，利用Iteator");   //第三种打印方式，利用Iteator
        Iterator<Student> it = hs.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }



    }
}
