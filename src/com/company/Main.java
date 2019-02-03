package com.company;

public class Main {

    public static void main(String[] args) {
        Girl masha = new Girl("Masha", 18, 178);
        System.out.println(masha);
        Girl dasha = new Girl("Dasha", 20, 168);
        Girl sasha = new Girl("Sasha", 22, 171);
        System.out.println(dasha);
        System.out.println(masha.age);
        masha.goToTheCinema();
        dasha.goToTheCinema();
        masha.goToTheRest("Argentina");
        System.out.println(sasha);
        sasha.goToTheCinema();
        sasha.goToTheRest("Mac");
    }
}
