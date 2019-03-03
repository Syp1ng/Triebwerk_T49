import java.util.ArrayList;

public class CommandDecreaseRPM implements ICommand {
    private ArrayList<ControlModul> controlModuls;
    private double decreaseValue;

    public CommandDecreaseRPM(ArrayList<ControlModul> controlModuls, double increaseValue) {
        this.controlModuls = controlModuls;
        this.decreaseValue = increaseValue;
    }

    public void execute() {
        for (ControlModul cm : controlModuls) {
            cm.decreaseRPM(decreaseValue);
        }

    }
}
