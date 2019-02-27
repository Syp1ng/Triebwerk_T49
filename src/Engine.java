public class Engine {
    private String type;
    private int rpm;

    public Engine(String type){
        this.type = type;
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
}
