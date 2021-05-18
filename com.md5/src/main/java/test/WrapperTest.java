package test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class WrapperTest {

    @Test
    public void   date(){
        // 距离1970-1-1 00:00:00 到现在经过的毫秒时间
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        // 格式化器
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(timeMillis));
    }

    @Test
    public void test1(){
        Date date = new Date(2021-1900,2-1,2);
        System.out.println(date);
    }

    @Test
    public void date2(){

        //new LocalDate(); 不能new
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);

        LocalDate localDate1 = localDate.withYear(2008);
        LocalDate localDate2 = localDate1.withMonth(8);
        LocalDate localDate3 = localDate2.withDayOfMonth(8);
        System.out.println(localDate3);

        LocalDate localDate4 = localDate1.withYear(2021).withMonth(4).withDayOfMonth(5);
        System.out.println(localDate4);

        //加500年
        LocalDate localDate5 = localDate4.plusYears(500);
        System.out.println(localDate5);

        //再减100年
        LocalDate localDate6 = localDate5.minusYears(100);
        System.out.println(localDate6);


    }
    


}
