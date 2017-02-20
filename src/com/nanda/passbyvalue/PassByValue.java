package com.nanda.passbyvalue;

/**
 * Created by Nandakumar.Menon on 20-02-2017.
 */
public class PassByValue {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        foo(aDog);

        if (aDog.getName().equals("Max")) { //true
            System.out.println("Java passes by value.");

        } else if (aDog.getName().equals("Fifi")) {
            System.out.println("Java passes by reference.");
        }
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true

        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }

    private static class Dog {
        private String name;

        Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}