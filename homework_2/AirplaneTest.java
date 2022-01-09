package homework_2;

import java.util.Calendar;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane boeing = new Boeing747();
        Calendar departureDate = Calendar.getInstance();
        Calendar arrivalDate = Calendar.getInstance();

        departureDate.set(2022, 1, 1);
        arrivalDate.set(2022, 1, 2);
        boeing.setDepartureDate(departureDate);
        boeing.setArrivalDate(arrivalDate);
        boeing.setDepartureLand("도쿄");
        boeing.setArrivalLand("인천");
        System.out.println(boeing.flight());
        System.out.println(boeing.getIsDomestic());
    }
}
