import java.util.ArrayList;

public class CommandDecreaseRPM implements ICommand {
    ArrayList<ControlModul> controlModuls;
    double decreaseValue;

    public CommandDecreaseRPM(ArrayList<ControlModul> controlModuls, double increaseValue){
        this.controlModuls = controlModuls;
        this.decreaseValue = increaseValue;
    }
    public void execute() {
        for (ControlModul cm:controlModuls) {
            cm.decreaseRPM(decreaseValue);
        }

    }
}
