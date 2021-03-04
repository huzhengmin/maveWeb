import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.readFileToString;

/**
 * @author： hzm
 * @date： 2021/2/25 15:42
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class FileUtilsTemp {
    @Test
    public void read()
    {
        try {
            System.out.println(    readFileToString(new File("c:/在线答辩连接.txt"),"GBK"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
