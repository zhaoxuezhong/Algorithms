package com.zxz.algorithms.chapter_1.基础编程模型;

public class Demo_14 {

    private static int lg(int n) {
        int shiftRightCount = 0;
        do {
            n /=2;
            //n >>=2;
            shiftRightCount++;
        } while (n != 0);
        return shiftRightCount-1;
    }

    public static void main(String[] args) {
        int value = 456;
        System.out.printf("the result of method log is :%s\r\n", lg(value));
    }
}
