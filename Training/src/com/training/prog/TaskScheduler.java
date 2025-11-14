package com.training.prog;
import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Backup Files");
        tasks.add("Update Software");
        tasks.add("Restart Server");

        System.out.println("Tasks: " + tasks);
        tasks.removeFirst();
        System.out.println("After removing first task: " + tasks);
    }
}
