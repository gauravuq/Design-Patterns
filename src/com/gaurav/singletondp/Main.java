package com.gaurav.singletondp;

public class Main {

    public static void main(String[] args) {

        SampleSingletonLazy lazy = SampleSingletonLazy.getInstance();
        System.out.println(lazy);

        SampleSingletonEarly early= SampleSingletonEarly.getInstance();
        System.out.println(early);

    }
}
