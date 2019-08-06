package cgc.first.utils;

import org.junit.Test;

public class FileUtilTest {

    @Test
    public void readResource() {
        String content = FileUtil.readResource("a.txt");
        System.out.println(content);
    }
}