package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Lab3Exercise1 {
    public class DataStructures {
        private List<TaskItem> tasks = new ArrayList<>();
        public enum Status {
            TO_DO,
            IN_PROGRESS,
            COMPLETED
        }
        public DataStructures() {


            tasks = Arrays.asList(
                    new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                    new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                    new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
        }
        public List<TaskItem> getAllTasks() {
            return tasks;
        }
        public List<TaskItem> getByStatus(Status status) {
            return tasks.stream()
                    .filter(tasks -> tasks.getStatus() == status)
                    .collect(Collectors.toList());
        }
        public List<TaskItem> getByIdGreaterOrEqual(int id) {
            return tasks.stream()
                    .filter(task -> task.getId() >= id)
                    .collect(Collectors.toList());
        }

        public void printTaskDescriptions() {
            tasks.forEach(task -> System.out.println(task.getDescription()));
        }





    }
    public static void main(String[] args) {

        Lab3Exercise1.DataStructures dataStructures = new Lab3Exercise1().new DataStructures();


        System.out.println("All tasks:");
        dataStructures.printTaskDescriptions();


        System.out.println("\nTasks in progress:");
        List<TaskItem> inProgressTasks = dataStructures.getByStatus(DataStructures.Status.IN_PROGRESS);
        inProgressTasks.forEach(task -> System.out.println(task.getDescription()));


        System.out.println("\nTasks with ID greater than or equal to 2:");
        List<TaskItem> idGreaterOrEqualTasks = dataStructures.getByIdGreaterOrEqual(2);
        idGreaterOrEqualTasks.forEach(task -> System.out.println(task.getDescription()));
    }
}

