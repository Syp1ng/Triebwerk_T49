public class Engine {
    private String type;
    private ControlModul controlModul;

    public Engine(int id, String type,ControlModul controlModul){
        this.controlModul =controlModul;
        controlModul.setEngine(this);
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    private int id;
    private double rpm;

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

    private boolean isActive = true;

    private Blade stepOneFan[];
    private Blade stepTwoFan[];
    private Blade stepThreeFan[];

    public Engine(int id, String type){
        this.id = id;
        this.type = type;

        stepOneFan=new Blade[48];
        stepTwoFan=new Blade[72];
        stepThreeFan=new Blade[96];


        for(int i=0;i<48;i++){
            stepOneFan[i] = new Blade();
        }
        for(int i=0;i<72;i++){
            stepTwoFan[i] = new Blade();
        }
        for(int i=0;i<96;i++){
            stepThreeFan[i] = new Blade();
        }

    }


    public String  entryForAir(){
        return "aaaabbaabbbbaa";
    }



    public String stageOne(String s){
        s="aaaabbaabbbbaa";
        return stageTwo(s);
    }
    private String stageTwo(String s){
        s="aaaabababbbbaa";
        return stageThree(s);
    }

    private String stageThree(String s) {
        s="aaaababababababa";
        return s;
    }

    public String burn(String s){
        return "kkk"+s;
    }
    public String exhaust(String s){
        s="";
        for(int i=0;i<=(int)rpm*0.4;i++){
            s+="s";
        }
        return s;
    }
}
