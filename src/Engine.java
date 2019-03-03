public class Engine {
    private String type;
    private ControlModul controlModul;
    private int id;
    private double rpm;
    private boolean isActive = true;
    private Blade[] stepOneFan;
    private Blade[] stepTwoFan;
    private Blade[] stepThreeFan;

    public Engine(int id, String type, ControlModul controlModul) {
        this.controlModul = controlModul;
        controlModul.setEngine(this);
        this.id = id;
        this.type = type;
    }

    public Engine(int id, String type) {
        this.id = id;
        this.type = type;
        stepOneFan = new Blade[48];
        stepTwoFan = new Blade[72];
        stepThreeFan = new Blade[96];
        for (int i = 0; i < 48; i++) {
            stepOneFan[i] = new Blade();
        }
        for (int i = 0; i < 72; i++) {
            stepTwoFan[i] = new Blade();
        }
        for (int i = 0; i < 96; i++) {
            stepThreeFan[i] = new Blade();
        }
    }

    public int getId() {
        return id;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String[] entryForAir() {
        String[] s = new String[2];
        s[0] = "aaaabbaabbbbaa";
        s[1] = "aaaabbaabbbbaa";
        return s;
    }


    public String[] stageOne(String[] s) {
        s[0] = "aaaabbaabbbbaa";
        s[1] = "aaaabbaabbbbaa";
        return stageTwo(s);
    }

    private String[] stageTwo(String[] s) {
        s[0] = "aaaabababbbbaa";
        s[1] = "aaaabababbbbaa";
        return stageThree(s);
    }

    private String[] stageThree(String[] s) {
        s[0] = "aaaababababababa";
        s[1] = "aaaababababababa";
        return s;
    }

    public String[] burn(String[] s) {
        s[0] = "kkk" + s[0];
        s[1] = "kkk" + s[1];
        return s;
    }

    public String[] exhaust(String[] s) {
        s[0] = "";
        s[1] = "";
        for (int i = 0; i <= (int) rpm * 0.4; i++) {
            s[0] += "s";
            s[1] += "s";
        }
        return s;
    }
}
