package com.zxz.algorithms.chapter_1.基础编程模型;

public class Demo_12{

    public static void main(String []args){
        int []a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=9-i;
        for(int i=0;i<10;i++)
            a[i]=a[a[i]];
        for(int i=0;i<10;i++)
            System.out.println(a[i]);
    }

}
