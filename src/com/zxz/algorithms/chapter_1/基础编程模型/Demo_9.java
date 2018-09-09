package com.zxz.algorithms.chapter_1.基础编程模型;

public class Demo_9 {

    public static void main(String []args){

        int N=1024;
        String s="";
        for (int n=N;n>0;n/=2)
            s=(n%2)+s;
        System.out.println(s);
    }
}
