package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final void createTask(final String taskClass, TasksRepository tasksRepository) {
        Task task = null;
         switch (taskClass) {
            case SHOPPING:
                task = new ShoppingTask("Buy sth!", "Car!", 4);
                tasksRepository.addTaskToRepo(task);
                break;
            case PAINTING:
                task = new PaintingTask("Paint sth!", "Blue!", "River!");
                tasksRepository.addTaskToRepo(task);
                break;
            case DRIVING:
                task = new DrivingTask("Taxi!", "Home!", "Train!");
                tasksRepository.addTaskToRepo(task);
                break;
            default:
                task = null;
        }

    }
}
