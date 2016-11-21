package com.nanda.reflection.classloaders;

/** run with -Djava.system.class.loader=MyCL to use this classloader */
public class MyCL extends ClassLoader {

    MyCL(ClassLoader parent) { // this constructor must be public, else IllegalAccessException
        super(parent);
    }
}