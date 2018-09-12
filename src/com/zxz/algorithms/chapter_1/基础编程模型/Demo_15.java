package com.zxz.algorithms.chapter_1.基础编程模型;

public class Demo_15 {

    public static void main(String []args){

        int []a={2,5,7,4,4,1,4,6,3,8,2,4};
        int m=10;
        int []b=histogram(a,m);
        int sum=0;
        for (int i=0;i<b.length;i++){
            sum+=b[i];
            System.out.print(b[i]+"\t");
        }
        System.out.println(sum);
        System.out.println(a.length);

    }

    public static int [] histogram(int []a, int m){
        int []b=new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < m) {
                b[a[i]]++;
            }
        }
        return b;
    }
}
