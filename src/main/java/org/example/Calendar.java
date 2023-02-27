package org.example;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Calendar<T extends Task> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private ArrayList<T> tasks;

    public Calendar() {
        this.tasks = new ArrayList<>();
    }
    public ArrayList<T> getTasks() {
        return tasks;
    }

    public void showAllTask() {
        int i = 1;
        for (T task : tasks) {
            System.out.println("\n\t№ " + i + " " + task);
            i++;
        }
    }

    public void addTask(T task) {
        this.tasks.add(task);
    }

    public void deleteTask(T task){
        this.tasks.remove(task);
    }

}


