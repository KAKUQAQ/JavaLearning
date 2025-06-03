package Date.Exer;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Exer {

    @Test
    public void test() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        Date date1 = calendar.getTime();
        System.out.println(date1);
    }

    @Test
    public void test2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime1);
    }
}
