package homework_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Airplane {
    private Calendar departureDate;
    private Calendar arrivalDate;
    private String departureLand;
    private String arrivalLand;
    private boolean isDomestic;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

    public String getDepartureDate() {
        return dateFormat.format(departureDate.getTime());
    }
    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }
    public String getArrivalDate() {
        return dateFormat.format(arrivalDate.getTime());
    }
    public void setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public String getDepartureLand() {
        return departureLand;
    }
    public void setDepartureLand(String departureLand) {
        this.departureLand = departureLand;
    }
    public String getArrivalLand() {
        return arrivalLand;
    }
    public void setArrivalLand(String arrivalLand) {
        this.arrivalLand = arrivalLand;
    }
    public boolean getIsDomestic() {
        return isDomestic;
    }
    public void setIsDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }
    public abstract String flight();
}
