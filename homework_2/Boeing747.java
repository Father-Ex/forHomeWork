package homework_2;

public class Boeing747 extends Airplane {

    @Override
    public String flight() {
        return String.format("%s에서 %s로 이동합니다", getDepartureLand(),getArrivalLand());
    }

    @Override
    public void setArrivalLand(String arrivalLand){
        switch(arrivalLand){
            case "김포":
            case "인천":
            case "김해":
            case "제주":
            case "울산":
                setIsDomestic(true);
                break;
            case "도쿄":
            case "상하이":
            case "홍콩":
            case "싱가폴":
            case "쿠알라룸푸르":
                setIsDomestic(false);
                break;
        }
        super.setArrivalLand(arrivalLand);
    }
    
}
