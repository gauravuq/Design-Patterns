package com.gaurav.singletondp;

public class SampleSingletonEarly {

    private String text;
    private static SampleSingletonEarly instance = new SampleSingletonEarly("Early"); //early

    private SampleSingletonEarly(String text) {
        this.text = text;
    }

    public static synchronized SampleSingletonEarly getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "SampleSingletonEarly{" +
                "text='" + text + '\'' +
                '}';
    }
}
