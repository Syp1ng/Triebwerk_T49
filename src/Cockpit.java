public class Cockpit {
    BordComputer bordComputer;

    public Cockpit(BordComputer bordComputer){
        this.bordComputer = bordComputer;
    }


    public void StartButton(){
        bordComputer.startSimulation();
    }
    public void ShutdownEngineButton(int i){
        System.out.println("Pilot: Shutdown engine number " + i);
        bordComputer.shutdown(i);
    }
}
