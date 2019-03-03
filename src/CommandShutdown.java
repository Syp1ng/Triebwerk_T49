public class CommandShutdown implements ICommand {
    private ControlModul controlModul;

    public CommandShutdown(ControlModul controlModul) {
        this.controlModul = controlModul;
    }

    public void execute() {
        controlModul.shutdown();
    }

}
