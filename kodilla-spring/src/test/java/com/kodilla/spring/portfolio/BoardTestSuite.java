package com.kodilla.spring.portfolio;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
       board.getDoneList().addToList("Task - Done List");
       board.getInProgressList().addToList("Task - In Progress List");
       board.getToDoList().addToList("Task - To Do list");

        //Then - Pint
        System.out.println(board.getDoneList().getTasks().toString());
        System.out.println(board.getInProgressList().getTasks().toString());
        System.out.println(board.getToDoList().getTasks().toString());

    }
}
