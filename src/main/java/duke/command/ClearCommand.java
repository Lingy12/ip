package duke.command;

import duke.Storage;
import duke.tool.TaskList;
import duke.ui.Ui;

/**
 * Represent the command that to clear all data.
 */
public class ClearCommand implements Command{

    @Override
    public void excute(TaskList tasks, Ui ui, Storage storage) {
        tasks.clear();
        ui.showClearMessage();
        storage.save(tasks);
    }

    @Override
    public boolean isExit() {
        return false;
    }

}
