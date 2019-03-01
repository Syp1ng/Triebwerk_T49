public class Airplane {
    public Engine[] getEngine() {
        return engine;
    }

    Engine[] engine;

    public Cockpit getCockpit() {
        return cockpit;
    }

    Cockpit cockpit;

    public Airplane(){
        this.engine = new Engine[4];
        for(int i = 0;i<4;i++){
        engine[i] = new Engine(i+1, "Rolls-Royce Trent 900");}
        cockpit = new Cockpit();
    }

}
