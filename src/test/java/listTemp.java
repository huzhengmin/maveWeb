import com.gaotai.Student;
import org.junit.Test;

import java.util.*;

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
    @Test
    public void test02()
    {
        List<String> sList = new ArrayList<>();
        sList.add("北京");
        sList.add("上海");
        sList.add("北京");
        sList.add("上海");
        for (String s:sList)
        {
            System.out.println(s);
        }
        Iterator<String> iList = sList.iterator();
        while (iList.hasNext())
        {
            System.out.println("iterator-->"+iList.next());
        }
        System.out.println(sList.get(0));
    }
    @Test
    public void test03()
    {
        System.out.println("set-----------");
        Set<String> sSet = new HashSet<>();
        sSet.add("北京");
        sSet.add("上海");
        sSet.add("北京");
        sSet.add("上海");
        sSet.add("重庆");
        for (String s:sSet)
        {
            System.out.println(s);
        }
        System.out.println(sSet);
    }
    @Test
    public void test04()
    {
        Map<Integer,String> oMap = new HashMap<>() ;
        oMap.put(0,"北京");
        oMap.put(1,"上海");
        oMap.put(0,"重庆");

        Iterator iMap = oMap.keySet().iterator();
        while (iMap.hasNext())
        {
            System.out.println(oMap.get(iMap.next()));
        }
        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<Integer, String>> it = oMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

    }
    @Test
    public void test05()
    {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++) //这里也可以改写为  for(String str:strArray) 这种形式
        {
            System.out.println(strArray[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历

        Iterator<String> ite=list.iterator();
        while(ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }
}
