package duke.task;

/**
 * Represents a task.
 */
public class Task {
    protected String desciption;
    protected boolean isDone;

    public Task(String description) {
        this.desciption = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718");
    }

    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Returns a string to be stored in data file.
     * @return Formatted string to be used in data file.
     */
    public String toFileStringFormat() {
        return String.format("%d / %s",isDone ? 1 : 0,this.desciption);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", this.getStatusIcon(),this.desciption);
    }
}
