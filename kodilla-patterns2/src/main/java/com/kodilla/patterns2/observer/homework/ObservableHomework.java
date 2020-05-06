package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface ObservableHomework {
    void registerObserver(ObserverHomeWork observer);
    void notifyObservers();
    void removeObserver(ObserverHomeWork observer);
}
