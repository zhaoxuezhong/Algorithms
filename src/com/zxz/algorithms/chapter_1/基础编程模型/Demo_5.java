package com.zxz.algorithms.chapter_1.基础编程模型;

import edu.princeton.cs.algs4.StdIn;

public class Demo_5 {

    public static void main(String []args){

        double x=StdIn.readDouble();
        double y=StdIn.readDouble();
        if(x>0&&x<1&&y>0&&y<1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
