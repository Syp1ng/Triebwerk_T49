import java.util.ArrayList;

public class CommandIncreaseRPM implements ICommand {
    private ArrayList<ControlModul> controlModuls;
    private double increaseValue;

    public CommandIncreaseRPM(ArrayList<ControlModul> controlModuls, double increaseValue) {
        this.controlModuls = controlModuls;
        this.increaseValue = increaseValue;
    }

    public void execute() {
        for (ControlModul cm : controlModuls) {
            cm.increaseRPM(increaseValue);
        }

    }
}
