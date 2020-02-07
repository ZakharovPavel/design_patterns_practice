package local.study.composite;

public class TaskImpl implements Task {

    private final String description;

    public TaskImpl(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
