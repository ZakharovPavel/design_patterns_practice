package local.study.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week {

    private Map<String, List> week;
    private List<Task> list;

    public Week() {
        this.week = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public void addToSchedule(String day, Task schedule) {
        if (week.containsKey(day)) {
            list = week.get(day);
            list.add(schedule);
        } else {
            list = new ArrayList<>();
            list.add(schedule);
            week.put(day, list);
        }
    }

    public String getSchedule(String day) {
        if (week.containsKey(day)) {
            StringBuilder stringBuilder = new StringBuilder();
            list = week.get(day);
            for (Task task : list) {
                stringBuilder.append(task.getDescription()).append(";\n");
            }
            return stringBuilder.toString();
        }
        return "Weekend!";
    }

}
