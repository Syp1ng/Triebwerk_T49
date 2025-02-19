//Mediator

import java.util.ArrayList;
import java.util.Random;

public class BordComputer {
    private ICommand command;
    private Airplane airplane;
    private double probability = 0.005;
    private ArrayList<ControlModul> controlledModules;
    private ArrayList<ControlModul> activeEngines;

    public BordComputer() {
        controlledModules = new ArrayList<>();
        activeEngines = new ArrayList<>();
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public void startSimulation() {
        //Taxi
        System.out.println("Taxi");
        for (int i = 0; i < 5; i++) {
            command = new CommandIncreaseRPM(activeEngines, calculateRPM(10));
            command.execute();
        }
        //TakeOff
        System.out.println("TakeOff");
        for (int i = 0; i < 8; i++) {
            command = new CommandIncreaseRPM(activeEngines, calculateRPM(30));
            command.execute();
        }
        System.out.println("V1 reached: " + controlledModules.get(1).getEngine().getRpm() * 0.4 + "kmh");
        //Climb
        System.out.println("Climb");
        Random r = new Random();
        if (r.nextDouble() <= probability) {
            int engineNumber = r.nextInt(4);
            controlledModules.get(engineNumber).WarningBirdDamage();
        }
        for (int i = 0; i < 15; i++) {
            command = new CommandIncreaseRPM(activeEngines, calculateRPM(40));
            command.execute();
        }
        //Descent
        System.out.println("Descent");
        for (int i = 0; i < 22; i++) {
            command = new CommandDecreaseRPM(activeEngines, calculateRPM(25));
            command.execute();
        }
        System.out.println("Land");
        //Land
        for (int i = 0; i < 5; i++) {
            command = new CommandDecreaseRPM(activeEngines, calculateRPM(60));
            command.execute();
        }
    }

    public void registerCotrolModul(ControlModul controlModul) {
        controlledModules.add(controlModul);
        activeEngines.add(controlModul);
    }

    private double calculateRPM(int kmh) {
        return kmh / 0.4;
    }

    public void notifyDamage(ControlModul controlModul) {
        System.out.println("BordComputer Bird Damage in Engine " + controlModul.getEngine().getId());
        airplane.getCockpit().shutdownEngineButton(controlModul.getEngine().getId());
    }

    public void shutdown(int number) {
        command = new CommandShutdown(activeEngines.get(number - 1));
        activeEngines.remove(number - 1);
    }
}
