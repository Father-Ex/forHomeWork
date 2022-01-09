package homework_2;

public class Human implements Runnable,Speak {

    private int speed;
    private String direction;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void loud() {
        System.out.println("오버라이딩 된 loud메소드");
    }

    @Override
    public void silent() {
        System.out.println("오버라이딩 된 silent메소드");
    }
    
}
