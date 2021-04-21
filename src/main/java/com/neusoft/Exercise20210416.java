package com.neusoft;

/*
 *  金融第一研发中心 每周一练（20210416）
 */
public class Exercise20210416 {

    /*
     * 写一个程序，它能够计算x到y的总和，其中x不一定比y小。 注：x和y是任意数字正整数。
     *
     * @param x
     * @param y
     * @return sum
     */
    public static int sumXToY_A(int x, int y) {

        int sum = 0;

        if (x >= y) {
            for (int i = y; i <= x; i++) {
                sum += i;
            }
        } else {
            for (int i = x; i <= y; i++) {
                sum += i;
            }
        }

        return sum;
    }

    /*
     * 写一个程序，它能够计算x到y的总和，其中x不一定比y小。 注：x和y是任意数字正整数。
     *
     * @param x
     * @param y
     * @return sum
     */
    public static int sumXToY_B(int x, int y) {

        // Sn=n(a1+an)/2
        return (Math.abs(x - y) + 1) * (x + y) / 2;
    }


}
