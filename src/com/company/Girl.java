package com.company;

public class Girl {
     String name;
     int age;
     int he;

    public Girl(String name, int age, int he) {
        this.name = name;
        this.age = age;
        this.he = he;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", he=" + he +
                '}';
    }

    public void goToTheCinema() {
        System.out.println("go to the cinema, " + name);
    }


    public void goToTheRest(String rest) {
        if ("Argentina".equals(rest)) {
            System.out.println("GO!!!");
        } else if ("Mac".equals(rest)) {
            System.out.println("NO!!!");
        } else {
            System.out.println("What???");

        }
    }
}
