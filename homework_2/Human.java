package homework_2;

public class Human implements Runnable,Speak {

    @Override
    public void loud() {
        System.out.println("오버라이딩 된 loud메소드");
    }

    @Override
    public void silent() {
        System.out.println("오버라이딩 된 silent메소드");
    }
    
}
