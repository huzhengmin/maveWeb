import com.gaotai.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author： hzm
 * @date： 2021/2/24 9:46
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class listTemp {
    @Test
    public void temp1()
    {
        ArrayList<String> list1 = new ArrayList<>();

        System.out.println("list1初始长度为："+ list1.size());
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        //将B2添加在list1的index=1的位置
        list1.add(1, "B2");
        System.out.println("list1加入元素后的大小：" + list1.size());
        System.out.println("list1元素为："+ list1);
        list1.remove("A");
        list1.remove(2);
        list1.remove("F");
        System.out.println("list1删除元素后的大小：" + list1.size());
        System.out.println("list1元素为：" + list1);
    }
    @Test
    public void temp2()
    {
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("lili",001));
        list1.add(new Student("haha",002)); //匿名对象存入集合
        list1.add(new Student("wawa",003));

        Iterator<Student> it=list1.iterator();
        while(it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu );

        }
    }
    @Test
    public void test01()
    {
        List<String> list = new ArrayList<String>();

        list.add( "1");
        list.add( "2");
        list.add( "3");
        list.add( "4");
//       for (int i =0;i<list.size();i++)
//        {
//            if(i==1||i==2){
//                list.remove(i);
//            }
//        }
        for (String str:list)
        {
            if(str.equals("1"))
            {
                list.remove(str);
            }
        }
        System.out.println(list);
    }

}
