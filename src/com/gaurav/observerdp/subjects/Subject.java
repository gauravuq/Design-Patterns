package com.gaurav.observerdp.subjects;

import com.gaurav.observerdp.observers.Observer;

public interface Subject {

    public void registerObserver (Observer arg);
    public void removeObserver (Observer arg);
    public void notifyObservers();

}
