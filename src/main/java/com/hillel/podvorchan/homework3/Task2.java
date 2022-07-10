package com.hillel.podvorchan.homework3;

import static java.lang.Math.PI;

public class Task2 {
    public static void main(String[] args) {
        byte r1 =1;
        float r2=0.5f;
        float r3 =0.2f;
        float p =0.7f;
        double V1= ((double) 4/3)*Math.PI* Math.pow (r1, 3);
        System.out.println(V1);
        double V2 =((double) 4/3)*Math.PI *Math.pow (r2, 3);
        System.out.println(V2);
        double V3 =((double) 4/3)*Math.PI*Math.pow (r3 ,3);
        System.out.println(V3);
        double m =(V1+V2+V3)*0.7;
        System.out.println(m);


    }


}
