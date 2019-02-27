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
    }
    public void decreaseRPM(int rpm){
        this.rpm -=rpm;
    }
}
