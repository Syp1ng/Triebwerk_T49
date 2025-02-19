public class ControlModul {

    private Engine engine;
    private BordComputer bordComputer;
    public ControlModul(BordComputer bordcomputer) {
        this.bordComputer = bordcomputer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String[] fansActive() {
        engine.setActive(true);
        String[] s = engine.entryForAir(); //(1)
        s = engine.stageOne(s);//(2)
        s = engine.burn(s);//(3)
        s = engine.exhaust(s);//(4)
        System.out.println("Triebwerk " + engine.getId() + " Abgas " + s[0]);
        return s;
    }

    public void shutdown() {
        engine.setRpm(0);
        engine.setActive(false);
    }

    public void increaseRPM(double rpm) {
        engine.setRpm(engine.getRpm() + rpm);
        if (engine.getRpm() > 2550) engine.setRpm(2550);
        fansActive();
    }

    public void decreaseRPM(double rpm) {
        engine.setRpm(engine.getRpm() - rpm);
        fansActive();
    }

    public void WarningBirdDamage() {
        bordComputer.notifyDamage(this);
    }
}
