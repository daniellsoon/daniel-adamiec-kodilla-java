package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.TaskFactory;
import com.kodilla.patterns.factory.tasks.TasksRepository;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskRepository() {
        //Given
        TasksRepository tasksRepository = new TasksRepository();
        TaskFactory taskFactory = new TaskFactory();
        //When
        taskFactory.createTask(TaskFactory.DRIVING, tasksRepository);
        taskFactory.createTask(TaskFactory.SHOPPING, tasksRepository);
        taskFactory.createTask(TaskFactory.PAINTING, tasksRepository);
        //Then
        Assert.assertEquals(3, tasksRepository.getTaskCollection().size());
        tasksRepository.showTasks();
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TasksRepository tasksRepository = new TasksRepository();
        TaskFactory taskFactory = new TaskFactory();
        //When
        taskFactory.createTask(TaskFactory.DRIVING, tasksRepository);
        Assert.assertEquals("Taxi!", tasksRepository.getTaskCollection().get(0).getTaskName());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TasksRepository tasksRepository = new TasksRepository();
        TaskFactory taskFactory = new TaskFactory();
        //When
        taskFactory.createTask(TaskFactory.SHOPPING, tasksRepository);
        //Then
        Assert.assertEquals("Buy sth!", tasksRepository.getTaskCollection().get(0).getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TasksRepository tasksRepository = new TasksRepository();
        TaskFactory taskFactory = new TaskFactory();
        //When
        taskFactory.createTask(TaskFactory.PAINTING, tasksRepository);
        //Then
        Assert.assertEquals("Paint sth!", tasksRepository.getTaskCollection().get(0).getTaskName());
    }

}
