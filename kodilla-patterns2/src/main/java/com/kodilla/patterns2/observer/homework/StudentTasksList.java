package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTasksList implements ObservableHomework {

    private List<ObserverHomeWork> observers;
    private Deque<String> tasks;
    private String studentName;

    public StudentTasksList(String studentName) {
        this.studentName = studentName;
        tasks = new ArrayDeque<String>();
        observers = new ArrayList<>();
    }

    public void offerToQue(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    public String getStudentName() {
        return studentName;
    }

    public Deque<String> getTasks() {
        return tasks;
    }


    @Override
    public void registerObserver(ObserverHomeWork observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomeWork observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomeWork observer) {
        observers.remove(observer);
    }
}
