public class Airplane {
    private Engine[] engine;
    private Cockpit cockpit;
    private BordComputer bordComputer;

    public Airplane(BordComputer bordComputer, Cockpit cockpit, Engine[] engine) {
        this.bordComputer = bordComputer;
        bordComputer.setAirplane(this);
        this.cockpit = cockpit;
        this.engine = engine;
    }

    public Engine[] getEngine() {
        return engine;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public BordComputer getBordComputer() {
        return bordComputer;
    }

}
