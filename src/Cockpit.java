public class Cockpit extends Airplane {
    ICommand command;
    BordComputer bordComputer;

    public Cockpit(){
        bordComputer = new BordComputer();
    }

    public void setCommand(ICommand command){
        this.command = command;
    }



    public void StartButton(){
        bordComputer.startSimulation();
    }
    public void ShutdownButton(Engine engine){
        setCommand(new CommandShutdown(engine));
    }
}
