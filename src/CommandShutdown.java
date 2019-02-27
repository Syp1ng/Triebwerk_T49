public class CommandShutdown implements ICommand {
    Engine engine;

    public CommandShutdown(Engine engine){
        this.engine = engine;
    }
    public void execute() {
        engine.shutdown();
    }

}
