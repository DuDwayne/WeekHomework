package com.neusoft;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 *  金融第一研发中心 每周一练（20210521）
 */
public class Exercise20210521 {

    /*
     * 写一个函数，输入一个日期（格式：yyyy/MM/dd），输出如下结果。
     *  1.判断这个日期是周几？
     *  2.这个日期是当月的第几天？
     *  3.这个日期是当年的第几天？
     *  4.当前日期是当年的第几季度？
     *  要求：代码整洁，程序和注释合情合理，具体实现不做限制。
     */

    static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    /**
     * 描述 判断输入日期是星期几
     *
     * @param date yyyy/MM/dd
     * @return String
     */
    public static String getDayOfTheWeek(String date) {
        String[][] strArray = {{"MONDAY", "一"}, {"TUESDAY", "二"}, {"WEDNESDAY", "三"}, {"THURSDAY", "四"},
                {"FRIDAY", "五"}, {"SATURDAY", "六"}, {"SUNDAY", "日"}};

        LocalDate ldForGetDayOfTheWeek = LocalDate.parse(date, df);

        String k = String.valueOf(ldForGetDayOfTheWeek.getDayOfWeek());

        for (String[] strings : strArray) {
            if (k.equals(strings[0])) {
                k = strings[1];
                break;
            }
        }

        return "星期" + k;
    }

    /**
     * 描述 获取输入日期是当月的第几天
     *
     * @param date yyyy/MM/dd
     * @return String
     */
    public static String getInputDayOfMonth(String date) {

        LocalDate ldForGetDayOfMonth = LocalDate.parse(date, df);

        // 获取当前日期的月份
        int dayOfMonth = ldForGetDayOfMonth.getDayOfMonth();

        return "该日期是本月的第" + dayOfMonth + "天";
    }

    /**
     * 描述 获取输入日期是当年的第几天
     *
     * @param date yyyy/MM/dd
     * @return String
     */
    public static String getDayOfYear(String date) {

        LocalDate ldForGetDayOfYear = LocalDate.parse(date, df);

        // 获取当前日期的月份
        int dayOfYear = ldForGetDayOfYear.getDayOfYear();

        return "该日期是本月的第" + dayOfYear + "天";
    }

    /**
     * 描述 判断输入日期是第几季度
     *
     * @param date yyyy/MM/dd
     * @return String
     */
    public static String getQuarter(String date) {

        LocalDate ldForGetQuarter = LocalDate.parse(date, df);

        // 获取当前日期的月份
        int month = ldForGetQuarter.getMonth().getValue();

        // 根据月份判断季度
        if (month <= 3) {
            return "第一季度";
        } else if (month <= 6) {
            return "第二季度";
        } else if (month <= 9) {
            return "第三季度";
        } else {
            return "第四季度";
        }
    }
}
