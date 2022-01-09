package homework_2;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class No7_to_9 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Date> dateList = new ArrayList<Date>();

        Date now = new Date();
        dateList.add(now);

        Date tomorrow = new Date();
        tomorrow.setDate(now.getDate()+1);
        dateList.add(tomorrow);

        Date randomDate = new Date(121, random.nextInt(12), random.nextInt(31)+1);

        System.out.println(dateList.get(0).toString());
        System.out.println(dateList.get(1).toString());
        System.out.println(randomDate.toString());

        LocalDate localNow = LocalDate.now();
        LocalDate localRandom = LocalDate.of(randomDate.getYear()+1900, randomDate.getMonth()+1, randomDate.getDate());
        Period between = Period.between(localRandom, localNow);
        System.out.println("현재와 랜덤생성 날짜의 차이는");
        System.out.printf("%d년 %d개월 %d일 입니다",between.getYears(),between.getMonths(),between.getDays());

    }
}
