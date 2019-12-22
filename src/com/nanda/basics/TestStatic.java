package com.nanda.basics;

public class TestStatic {

    int t1 = 10;
    static int t2 = 10;

    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
        TestStatic testStatic1 = new TestStatic();

        int i = testStatic.t1 + 10;
        testStatic.t2 = 20;
        testStatic1.t2 = 30;

        int j = t2 + 10;
        System.out.println(testStatic.t2+"   "+testStatic1.t2);



    }

}
