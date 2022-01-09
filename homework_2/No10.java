package homework_2;

import java.util.*;

public class No10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        List<Airplane> planeList = new ArrayList<Airplane>();

        for(int i=0; i<5; i++){
            Calendar departure = Calendar.getInstance();
            Calendar arrival = Calendar.getInstance();
            Airplane plane = new Boeing747();
            departure.set(Calendar.DAY_OF_MONTH, departure.get(Calendar.DAY_OF_MONTH)+random.nextInt(7)+1);
            arrival.set(Calendar.DAY_OF_MONTH,departure.get(Calendar.DAY_OF_MONTH)+1);
            plane.setDepartureDate(departure);
            plane.setArrivalDate(arrival);
            planeList.add(plane);
        }

        List<Human> humanList = new ArrayList<Human>();
        String[] lands = {"김포","인천","김해","제주","울산","도쿄","상하이","홍콩","싱가폴","쿠알라룸푸르"};
        
        for(int i=0; i<3; i++){
            Human human = new Human();
            human.setSpeed(random.nextInt(7)+1);
            human.setDirection(lands[random.nextInt(10)]);
            humanList.add(human);
        }

        Calendar now = Calendar.getInstance();

        for(int i=0; i<planeList.size(); i++){
            Airplane tmp = planeList.get(i);
            int departDay = tmp.getDepartureDate().get(Calendar.DAY_OF_MONTH);
            int today = now.get(Calendar.DAY_OF_MONTH);
            int dDay = departDay-today;
            int humanNum = 1;
            for(Human tmph:humanList){
                if(dDay<=tmph.getSpeed()){
                    System.out.printf("%d번 휴먼은 %d번 비행기 탑승 가능",humanNum,i+1);
                }
            }
        }
    }
}
