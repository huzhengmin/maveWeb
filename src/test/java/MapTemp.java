import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @author： hzm
 * @date： 2021/2/24 10:15
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class MapTemp {
    @Test
    public void test12()
    {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
    }
    @Test
    public void test11()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }

    }
    @Test
    public void temp1() {
        HashMap<String, String> map = new HashMap<>();

        System.out.println(map.put("ABC001", "Kevin"));
        System.out.println(map.put("ABC002", "Lily"));
        System.out.println(map.put("ABC001", "Clack"));  //此处Key与第一个重复！！

        //：V put （K key，V value），就是将key映射到value，如果key存在，则覆盖value，并将原来的value返回。
        System.out.println(map);
    }

    @Test
    public void temp2() {

        HashMap<String, String> map = new HashMap<>();
        map.put("ABC001", "Kevin");
        map.put("ABC002", "Lily");
        map.put("ABC001", "Clack");
        map.put("ABC003", "Bob");
        map.put("ABC004", "Zombie");

        //Collection<V> values()
        Collection<String> values=map.values();
        System.out.println("-----------取所有value");
        for(String value: values) {
            System.out.println(value);
        }

        //Set<K> keySet()
        System.out.println("-----------取所有key");
        Set<String> keys = map.keySet();
        for(String key: keys) {
            System.out.println(key);
        }
    }
    @Test
    public void temp3()
    {

        HashMap<String, String> map = new HashMap<>();
        map.put("ABC001", "Kevin");
        map.put("ABC002", "Lily");
        map.put("ABC001", "Clack");
        map.put("ABC003", "Bob");
        map.put("ABC004", "Zombie");

        //获取所有key
        Set<String> keys = map.keySet();
        System.out.println("-----------遍历功能一");
        for(String key: keys) {
            //通过Key来找Value
            String value = map.get(key);
            System.out.println("ID:"+key+"--Name: "+value);
        }
        System.out.println("-----------遍历功能二");
        //获取所有中间人entrys
        Set<Map.Entry<String, String>> entrys =map.entrySet();
        //遍历所有entrys用Map.Entry<String, String>类型的entry接收
        for(Map.Entry<String, String> entry:entrys) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("ID:"+key+"--Name: "+value);
        }
    }
}
