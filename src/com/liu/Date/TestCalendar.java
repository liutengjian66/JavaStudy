package com.liu.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2999, 10, 9, 22, 20, 20);
        System.out.println(calendar);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        int day = calendar.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month); //输出10 表示11月
        System.out.println(weekday); //1-7表星期日到 星期一 星期二。。。
        System.out.println(day);
        calendar.setTime(new Date()); //Date对象转换为Calendar对象
    }
}
