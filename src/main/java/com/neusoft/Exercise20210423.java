package com.neusoft;

/**
 *  金融第一研发中心 每周一练（20210423）
 */
public class Exercise20210423 {

    /**
     * 计算一天之中，所有时针和分针重合的时间。
     */
    public static void countCoincide() {

        //重合次数
        int count = 0;

        //每天一共有 24 * 60 分钟
        int sumMinutes = 1440;

        //分针位置
        float mPosition = 0;
        //时针位置
        float hPosition = 0;

        for (int i = 0; i < sumMinutes; i++) {
            float m1 = i / (60f);
            float m2 = i / (12* 60f);
            float temp1 = m1 - (int)m1;
            float temp2 = m2 - (int)m2;

            if (mPosition < hPosition && temp1 > temp2 || temp1 == temp2) {
                count++;
            }
            mPosition = temp1;
            hPosition = temp2;
        }
        System.out.println("时针和分针一天中重合的次数为：" + count + "次");
    }

}
