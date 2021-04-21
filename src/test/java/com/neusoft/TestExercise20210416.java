package com.neusoft;

public class TestExercise20210416 {

    public static void main(String[] args) {

        int x = 100;
        int y = 50;

        int resultOfMethodA = Exercise20210416.sumXToY_A(x, y);

        int resultOfMethodB = Exercise20210416.sumXToY_B(x, y);

        System.out.println(x + "到" + y + "的和是：" + resultOfMethodA);

        System.out.println(x + "到" + y + "的和是：" + resultOfMethodB);

    }
}
