import cgc.first.utils.FileUtil;
import cgc.first.service.BirthDayService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BirthDayService birthDayService = new BirthDayService();
        String string = FileUtil.readResource("a.txt");
        List<String> personStringList = birthDayService.getPersonStringList(string);
        birthDayService.sendBirthDay(personStringList);
    }
}
