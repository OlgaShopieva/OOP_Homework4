package org.example;


import java.time.LocalDateTime;


public class Task {
    private String title;
    private Priority priority;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;


    public Task(String title, Priority priority, LocalDateTime dateStart, LocalDateTime dateEnd) {
        this.title = title;
        this.priority = priority;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }



    @Override
    public String toString() {
        return "\n Title: " + title +
                "\n Priority: " + priority +
                "\n Date start: " + dateStart +
                "\n Date end: " + dateEnd;
    }
}