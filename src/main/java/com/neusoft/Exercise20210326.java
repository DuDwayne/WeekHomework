package com.neusoft;

import java.util.regex.Pattern;

/**
 *  金融第一研发中心 每周一练（20210326）
 */
public class Exercise20210326 {

    /**
     *  写一个程序，任意一个字符串作为传入参数，判断传入的字符串，
     *  分别统计这个字符串中英文字母、空格、数字和其他字符的个数，并输出。
     * @param inputString 输入的字符串
     */
    public static void countString (String inputString){
        // 字母的个数
        int countLetter = 0;
        // 数字的个数
        int countNumber = 0;
        // 空格的个数
        int countSpace = 0;
        // 其他字符的个数
        int countOther = 0;

        Pattern patternLetter = Pattern.compile("[a-zA-Z]");
        Pattern patternNumber = Pattern.compile("[0-9]");
        Pattern patternSpace = Pattern.compile("[\\s]");

        for (int i = 0; i< inputString.length(); i++) {

            if(patternLetter.matcher(inputString.substring(i, i+1)).find()) {
                countLetter++;
            } else if(patternNumber.matcher(inputString.substring(i, i+1)).find()){
                countNumber++;
            } else if (patternSpace.matcher(inputString.substring(i, i+1)).find()){
                countSpace++;
            } else {
                countOther++;
            }
        }

        System.out.println("输入的字符串中字母的个数：" + countLetter);
        System.out.println("输入的字符串中数字的个数：" + countNumber);
        System.out.println("输入的字符串中空格的个数：" + countSpace);
        System.out.println("输入的字符串中非字母数字空格的个数：" + countOther);
    }
}
