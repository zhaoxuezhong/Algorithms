package com.zxz.algorithms.chapter_1.基础编程模型;

import edu.princeton.cs.algs4.StdIn;

public class Demo_3 {

    public static void main(String []args){

        int a=StdIn.readInt();
        int b=StdIn.readInt();
        int c=StdIn.readInt();
        if (a == b && a == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

}
