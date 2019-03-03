import java.util.ArrayList;

public class CommandShutdown implements ICommand {
    ControlModul controlModul;

    public CommandShutdown(ControlModul controlModus){
        this.controlModul = controlModul;
    }
    public void execute() {
        controlModul.shutdown();
    }

}
