public class Cockpit {
    ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }



    public void StartButton(){

    }
    public void ShutdownButton(Engine engine){
        setCommand(new CommandShutdown(engine));
    }
}
