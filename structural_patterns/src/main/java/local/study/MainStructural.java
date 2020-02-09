package local.study;

import local.study.composite.*;

public class MainStructural {

    public static void main(String[] args) {

        Task task1 = new TaskImpl("Wake Up");
        Task task2 = new TaskImpl("Sleep");
        Task taskComposite = new Schedule().add(task1, task2);

        System.out.println(task1.getDescription());
        System.out.println(taskComposite.getDescription());

        Week week = new Week();

        week.addToSchedule("Monday", task2);
        week.addToSchedule("Monday", task1);
        week.addToSchedule("Friday", taskComposite);
        System.out.println(week.getSchedule("Monday"));
        System.out.println(week.getSchedule("Friday"));

    }
}
