package com.gaurav.singletondp;

public class SampleSingletonLazy {

    private String text;
    private static SampleSingletonLazy instance;  //lazy

    private SampleSingletonLazy(String text){
    this.text = text;
    }

    public static synchronized SampleSingletonLazy getInstance(){
        if (instance == null)
        {
            instance = new SampleSingletonLazy("Lazy");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SampleSingletonLazy{" +
                "text='" + text + '\'' +
                '}';
    }
}
