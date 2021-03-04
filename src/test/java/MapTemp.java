import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author： hzm
 * @date： 2021/2/24 10:15
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class MapTemp {
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
