package com.younnescode.task;

import java.util.ArrayList;
public class TaskService {
    public static boolean isOutOfBounds(ArrayList<Task> tasks, int index) {
        return index < 0 || getById(tasks, index) == null;
    }

    public static boolean exists(ArrayList<Task> tasks, int index) {
        return getById(tasks, index) != null;
    }

    public static Task getById(ArrayList<Task> tasks, int id) {
        Task task = null;

        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId() == id) {
                task = tasks.get(i);
            }
        }

        return task;
    }
}
