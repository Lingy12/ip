package duke.command;

import duke.exception.DukeException;
import duke.task.Task;
import duke.Storage;
import duke.tool.TaskList;
import duke.ui.Ui;

/**
 * Represents an command that add task to list.
 * @author Linngy
 * @version 0.1
 */
public class AddCommand implements Command {

    /** Target task that will be added to the list */
    private final Task targetTask;

    /**
     * Creates a command to add task.
     *
     * @param task Task that will be added to the list.
     */
    public AddCommand(Task task) {
        this.targetTask = task;
    }

    @Override
    public void excute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        tasks.add(targetTask);
        ui.showAddedNotification(targetTask,tasks);
        storage.save(tasks);
    }

    @Override
    public boolean isExit() {
        return false;
    }

}
