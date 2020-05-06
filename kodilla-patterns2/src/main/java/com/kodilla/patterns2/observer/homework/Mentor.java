package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public class Mentor implements ObserverHomeWork {

    private final String mentorName;
    private int updateCount;

    public Mentor (String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTasksList tasksList) {
        System.out.println(mentorName + ": New task added from " + tasksList.getStudentName() + " \n" + " (total: " + tasksList.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
