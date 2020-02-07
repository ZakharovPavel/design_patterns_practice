package local.study.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Schedule implements Task {

    private List<Task> tasks;

    public Schedule() {
        this.tasks = new ArrayList<>();
    }

    public Task add(Task... tasks) {
        this.tasks.addAll(Arrays.asList(tasks));
        return this;
    }

    @Override
    public String getDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Task task : tasks) {
            stringBuilder.append(task.getDescription()).append(";\n");
        }
        return stringBuilder.toString();
    }
}
