package com.nanda.reflection.classloaders;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by nandakumar.menon on 30-10-2016.
 */
public class InvokerClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        PrivateObject privateObject = new PrivateObject("The Private Value");

        Method privateStringMethod = PrivateObject.class.
                getDeclaredMethod("getPrivateString", null);

        privateStringMethod.setAccessible(true);

        String returnValue = (String)
                privateStringMethod.invoke(privateObject, null);

        System.out.println("returnValue = " + returnValue);
    }

}
