package com.nanda.lambda;

import java.util.ArrayList;
import java.util.List;

public class PipelinesStreams {
    public static void main(String... args) {

        Animal animal = new Animal();
        List<Animal> animalList = animal.getAnimalList();

        System.out.println("**** using regular for loop:");
        for (Animal a : animalList) {
            System.out.println(a.getName() + " " + a.getType());
        }

        System.out.println("**** iteration using stream forEach:");
        animalList.stream().forEach(
                a -> System.out.println(a.getName() + " " + a.getType()));

        System.out.println("**** stream with filter:");
        animalList
                .stream()
                .filter(a -> a.getType() == Animal.WILD)
                .forEach(
                        a -> System.out.println(a.getName() + " " + a.getType()));

        System.out.println("**** stream with filter and count:");
        long count = animalList.stream()
                .filter(a -> a.getType() == Animal.DOMESTIC).count();
        System.out
                .println("Count of " + Animal.DOMESTIC + " animals: " + count);

        System.out
                .println("**** stream with filters and average on a property:");
        double averageAge = animalList.stream()
                .filter(a -> a.getType() == Animal.WILD)
                .filter(a -> a.getAge() > 2).mapToInt(Animal::getAge).average()
                .getAsDouble();
        System.out.println("Average age of " + Animal.WILD + " animals: "
                + averageAge);

    }

    public static class Animal {

        public final static String WILD = "Wild";
        public final static String DOMESTIC = "Domestic";

        private String name;
        private String type;
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Animal() {
        }

        public Animal(String name, String type, int age) {
            this.name = name;
            this.type = type;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Animal> getAnimalList() {
            List animalList = new ArrayList();
            animalList.add(new Animal("Crocodile", WILD, 30));
            animalList.add(new Animal("Jaguar", WILD, 9));
            animalList.add(new Animal("Puma", WILD, 2));
            animalList.add(new Animal("Dog", DOMESTIC, 3));
            return animalList;
        }
    }
}