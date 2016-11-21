package com.nanda.reflection.classloaders;

/**
 * Created by nandakumar.menon on 30-10-2016.
 */
public class PrivateObject {

    private String privateString = null;

    public PrivateObject(String privateString) {
        this.privateString = privateString;
    }

    private String getPrivateString(){
        return this.privateString;
    }
}
