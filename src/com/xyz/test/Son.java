package com.xyz.test;

/**
 * Created by xyz on 2017/9/22.
 */
class Father{
    public Father(){
        System.out.println("Father");
    }
}
public class Son extends Father{
    public Son(int i){
        System.out.println("Son");
    }

    public static void main(String[] args) {
        new Son(1);
    }
}
