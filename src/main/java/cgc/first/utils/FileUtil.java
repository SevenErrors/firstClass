package cgc.first.utils;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileUtil {
    public static String readResource(String path) {
        Reader reader;
        reader = getResourceReader(path);
        Scanner s = new Scanner(reader).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    private static Reader getResourceReader(String name) {
        try {
            InputStream is = FileUtil.class.getClassLoader().getResourceAsStream(getCPResourcePath(name));
            if (is == null) {
                is = new FileInputStream(new File(name));
            }
            return new InputStreamReader(is);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件不存在");
        }
    }

    private static String getCPResourcePath(String name) {
        if (!"/".equals(File.separator)) {
            return name.replaceAll(Pattern.quote(File.separator), "/");
        }
        return name;
    }

}
