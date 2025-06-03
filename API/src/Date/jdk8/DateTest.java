package Date.jdk8;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTest {

    @Test
    public void test() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate1 = LocalDate.of(2025, 6, 2);
        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 6, 2, 12, 34);
        LocalTime localTime1 = LocalTime.of(12, 34);

        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());

        LocalDateTime localDateTime3 = LocalDateTime.now().withDayOfMonth(15);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System.out.println(localDateTime4);

    }
    // instant 时间戳
    @Test
    public void test2() {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(instant1);
    }

    // DateTimeFormatter
    @Test
    public void test3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化 字符串-->>日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        String strDT = formatter.format(localDateTime);
        System.out.println(strDT);

        // 解析 字符串-->>日期时间
        TemporalAccessor temporalAccessor = formatter.parse("2025-06-03 13:40:16");
        LocalDateTime localDateTime1 = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime1);
    }
}
