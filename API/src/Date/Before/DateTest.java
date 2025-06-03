package Date.Before;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    @Test
    public void test() {
        Date date1 = new Date();// 创建当前系统时间的实例
        System.out.println(date1.toString());

        long milliTime = date1.getTime();
        System.out.println(milliTime);//对应的毫秒数
    }

    @Test
    public void test2() {
        java.sql.Date date1 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date1.toString());
    }

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String str = sdf.format(date);
        System.out.println(str);

        Date date1 = sdf.parse("2025-06-02 15:06:57");
        System.out.println(date1);
    }

    @Test
    public void test4(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

        calendar.add(Calendar.DAY_OF_WEEK,-1);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println(calendar.getTime());
        calendar.setTime(new Date());
        System.out.println(calendar.getTime());
    }

    @Test
    public void test5(){
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);
    }
}
