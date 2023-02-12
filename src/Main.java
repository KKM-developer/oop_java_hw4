import Tasks.BaseTask;
import TasksPlanner.Planner;
import Tasks.Task;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Task<Integer> task1 = new Task<>(
                1,
                "12.03.2022",
                "13.03.2022",
                "Mike",
                " Create API",
                BaseTask.priorityEnum.urgent
        );

        Task<String> task2 = new Task<>(
                "2",
                "22/02/22",
                "23/02/22",
                "Vova",
                "Search information",
                BaseTask.priorityEnum.low
        );

        Planner planner = new Planner(task1);

        planner.addTask(task2);
        planner.setCurrentTask(task2);
        System.out.printf("Количество задач: %s\n", planner.getCount());
        planner.showAll();
        planner.exportToCSV();

    }
}