package com.neusoft;

import java.text.NumberFormat;
import java.util.Random;

/**
 *  金融第一研发中心 每周一练（20210430）
 */
public class Exercise20210430 {

    /*
     * 小王是一个水果超市老板，买了一车樱桃，数量有22222个（大小随机，什么样的果都可能有，最小的果是10g，最大的果20g）。
     * 现在想要将这些樱桃按照大小（按重量分为小果【10-12g以下】，大果【12以上-15g以下】，特级果【15g以上】）进行打包（50个一箱），分级别出售。
     *
     * 小果50个（一箱）的价格为100元
     * 大果50个（一箱）的价格为150元
     * 特级果50个（一箱）的价格为200元
     *
     * 设计一个程序，模拟一下真实的场景，假如这些打包好的樱桃都能出手，一共能卖多少钱？
     * 小果，大果，特级果分别打包了多少箱？剩下未打包的樱桃有多少个？
     * 小果，大果，特级果分别在这车樱桃中的占比是多少？
     */

    /**
     * 生成一车樱桃，大小10-20g随机
     */
    public static int[] random() {
        Random r = new Random();
        int[] cherrys = new int[2222];
        for (int i = 0; i <= 2222 - 1; i++) {
            cherrys[i] = r.nextInt(11) + 10;
        }
        return cherrys;
    }

    /**
     * 计算得到的樱桃结果
     */
    public static void resultCalculate(int[] cherrys) {

        //获取小果的个数
        int smallCount = 0;
        //获取大果的个数
        int bigCount = 0;
        //获取特级果的个数
        int specalCount = 0;

        for (int cherry : cherrys) {
            if (cherry <= 12) {
                smallCount++;
            } else if (cherry <= 15) {
                bigCount++;
            } else {
                specalCount++;
            }
        }

        System.out.println("=========================================================");
        // Debug
        System.out.println("随机生成的小果有" + smallCount + "个 随机生成的大果有" + bigCount + "个 随机生成的特级果有" + specalCount);
        System.out.println("=========================================================");
        // 假如这些打包好的樱桃都能出手，一共能卖多少钱？
        System.out.println("打包好的樱桃都能出手，一共能卖" + (smallCount / 50 * 200
                + bigCount / 50 * 150 + specalCount / 50 * 100) + "元");
        System.out.println("=========================================================");
        // 小果，大果，特级果分别打包了多少箱？剩下未打包的樱桃有多少个？
        System.out.println("小果打包了" + smallCount / 50 + "箱");
        System.out.println("未打包的小果有" + smallCount % 50 + "个");

        System.out.println("大果打包了" + bigCount / 50 + "箱");
        System.out.println("未打包的大果有" + bigCount % 50 + "个");

        System.out.println("特级果打包了" + specalCount / 50 + "箱");
        System.out.println("未打包的特级果有" + specalCount % 50 + "个");
        System.out.println("=========================================================");
        // 小果，大果，特级果分别在这车樱桃中的占比是多少？
        NumberFormat nt = NumberFormat.getPercentInstance();
        nt.setMinimumFractionDigits(2);
        System.out.println("小果在这车樱桃中的占比是" + nt.format(((float) smallCount / 2222)));
        System.out.println("大果在这车樱桃中的占比是" + nt.format(((float) bigCount / 2222)));
        System.out.println("特级果在这车樱桃中的占比是" + nt.format(((float) specalCount / 2222)));
        System.out.println("=========================================================");
    }

}
