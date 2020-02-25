package com.kodilla.patterns.factory.tasks;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class TasksRepository {

    private List<Task> taskCollection;

    public TasksRepository() {
        taskCollection = new ArrayList<>();
    }

    public List<Task> getTaskCollection() {
        return taskCollection;
    }

    public void addTaskToRepo(Task task) {
        taskCollection.add(task);
    }


    public void showTasks() {
        taskCollection.forEach((k) -> System.out.println("Task:" + k.getTaskName() + ". " +
                "Need to done: " + k.isTaskExecuted()));
    }
}
