public class Cockpit {
    private BordComputer bordComputer;

    public Cockpit(BordComputer bordComputer) {
        this.bordComputer = bordComputer;
    }


    public void startButton() {
        bordComputer.startSimulation();
    }

    public void shutdownEngineButton(int i) {
        System.out.println("Pilot: Shutdown engine number " + i);
        bordComputer.shutdown(i);
    }
}
