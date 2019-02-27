public class CommandIncreaseRPM implements ICommand {
    Engine engine;
    int increaseValue;

    public CommandIncreaseRPM(Engine engine, int increaseValue){
        this.engine = engine;
        this.increaseValue = increaseValue;
    }
    public void execute() {
        engine.increaseRPM(increaseValue);
    }
}
