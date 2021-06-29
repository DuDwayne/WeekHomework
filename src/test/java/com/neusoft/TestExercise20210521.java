package com.neusoft;

import static com.neusoft.Exercise20210521.*;

public class TestExercise20210521 {

    public static void main(String[] args) {

        /*
         * 写一个函数，输入一个日期（格式：yyyy/MM/dd），输出如下结果。
         *  1.判断这个日期是周几？
         *  2.这个日期是当月的第几天？
         *  3.这个日期是当年的第几天？
         *  4.当前日期是当年的第几季度？
         *  要求：代码整洁，程序和注释合情合理，具体实现不做限制。
         */
        String testDate = "2021/06/29";

        System.out.println("输入的日期为:" + testDate);
        // 1.判断这个日期是周几？
        System.out.println("这个日期是" + getDayOfTheWeek(testDate));
        // 2.这个日期是当月的第几天？
        System.out.println("这个日期是" + getInputDayOfMonth(testDate));
        // 3.这个日期是当年的第几天？
        System.out.println("这个日期是" + getDayOfYear(testDate));
        // 4.当前日期是当年的第几季度？
        System.out.println("这个日期是" + getQuarter(testDate));

    }
}
