public class Airplane {
    public Engine[] getEngine() {
        return engine;
    }

    Engine[] engine;

    public Cockpit getCockpit() {
        return cockpit;
    }

    Cockpit cockpit;

    public BordComputer getBordComputer() {
        return bordComputer;
    }

    BordComputer bordComputer;

    public Airplane(BordComputer bordComputer, Cockpit cockpit, Engine engine[]) {
        this.bordComputer = bordComputer;
        bordComputer.setAirplane(this);
        this.cockpit = cockpit;
        this.engine = engine;
    }

}
