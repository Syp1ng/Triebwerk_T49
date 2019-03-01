public class Engine {
    private String type;
    private int id;
    private double rpm;

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
    public void fansActive(){
        String s = entryForAir(); //(1)
        s= stageOne(s);//(2)
        s = burn(s);//(3)
        s =exhaust(s);//(4)


    }


    public void shutdown(){
        rpm = 0;
    }
    public void increaseRPM(int rpm){
        this.rpm +=rpm;
        if(rpm>2550)rpm = 2550;
    }
    public void decreaseRPM(int rpm){
        this.rpm -=rpm;
    }


    public String  entryForAir(){
        return "aaaabbaabbbbaa";
    }



    private String stageOne(String s){
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

    private String burn(String s){
        return "kkk"+s;
    }
    private String exhaust(String s){
        s="";
        for(int i=0;i<=(int)rpm*0.4;i++){
            s+="s";
        }
        return s;
    }
}
