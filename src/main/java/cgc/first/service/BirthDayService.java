package cgc.first.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirthDayService {
    private static final String RegExp = "\\r\n";
    public List<String> getPersonStringList(String resource) {
        return Arrays.asList(resource.split(RegExp));
    }

    public void sendBirthDay(List<String> personMsg) {
        LocalDateTime now = LocalDateTime.now();
        int mouthToday = now.getMonthValue();
        int today = now.getDayOfMonth();
        List<String> collect = personMsg.stream()
                .peek(person -> {
                    String[] userInfo = person.split(",");
                    String[] birthday = userInfo[2].split("/");
                    int month = Integer.parseInt(birthday[1]);
                    int days = Integer.parseInt(birthday[2]);
                    if (month == mouthToday && days == today) {
                        System.out.println("Happy birthday!, dear " + userInfo[0]);
                    }
                }).collect(Collectors.toList());
    }

}
