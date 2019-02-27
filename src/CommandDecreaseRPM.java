public class CommandDecreaseRPM implements ICommand {
    Engine engine;
    int decreaseValue;

    public CommandDecreaseRPM(Engine engin, int decreaseValue){
        this.engine = engine;
        this.decreaseValue = decreaseValue;
    }
    public void execute() {
        engine.decreaseRPM(decreaseValue);
    }
}
