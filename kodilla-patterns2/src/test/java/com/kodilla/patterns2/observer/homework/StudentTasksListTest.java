package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTasksListTest {

    @Test
    public void testUpdate() {
        //Given
        StudentTasksList student1 = new StudentTasksList("student1");
        StudentTasksList student2 = new StudentTasksList("student2");
        StudentTasksList student3 = new StudentTasksList("student3");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);

        //When
        student1.offerToQue("Task1 S1");
        student1.offerToQue("Task2 S1");
        student1.offerToQue("Task3 S1");
        student2.offerToQue("Task1 S2");
        student2.offerToQue("Task2 S2");
        student3.offerToQue("Task1 S3");

        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }

}