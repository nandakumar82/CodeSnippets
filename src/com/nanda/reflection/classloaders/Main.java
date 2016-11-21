package com.nanda.reflection.classloaders;

public class Main {
    public static void main(String args[]) {
        System.out.println("getSystemClassLoader(): " + ClassLoader.getSystemClassLoader());

        MyCL myCL = new MyCL(ClassLoader.getSystemClassLoader());

        ClassLoader cl = MyCL.class.getClassLoader();
        System.out.println("MyCL's classloader: " + cl);

        Class class_of_cl = cl.getClass();
        System.out.println("MyCL's classloader's class: " + class_of_cl);

        ClassLoader cl_of_cl = class_of_cl.getClassLoader();
        System.out.println("MyCL's classloader's classloader: " + cl_of_cl);
    }
}
