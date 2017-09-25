package com.xyz.test;

/**
 * Created by xyz on 2017/9/21.
 */
public class Cylinder {
    double radius;  //定义成员变量radius
    int height;     //定义成员变量height
    double pi=3.14;
    void area() //定义无返回值的方法area()，用来计算圆柱底面积
    {
        System.out.println("底面积="+pi* radius* radius);
    }
    double volume ()//定义返回值为double型的方法volume ()，计算体积
    {
        return (pi* radius* radius)*height;
    }

    public static void main(String[] args) {
        new Cylinder().area();
    }

}
