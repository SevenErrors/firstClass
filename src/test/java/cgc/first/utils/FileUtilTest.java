package cgc.first.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileUtilTest {

    @Test
    public void readResource() {
        String content = FileUtil.readResource("a.txt");
        System.out.println(content);
    }
}