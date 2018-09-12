package com.zxz.algorithms.chapter_1.基础编程模型;

public class Demo_11 {

    public static void main(String []args){
        boolean[][] a = { { true, false, true }, { false, true, false },
                { true, true, false } };
        System.out.println("\t1\t2\t3");
        for (int i=0;i<a.length;i++){
            System.out.print(i+1+"\t");
            for (int j=0;j<a[i].length;j++){
                System.out.print((a[i][j]?"*":" ")+"\t");
            }
            System.out.println();
        }
    }
}
