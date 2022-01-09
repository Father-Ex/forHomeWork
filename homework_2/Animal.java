package homework_2;

public class Animal {
    private String name = "empty";
    private String location = "empty";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        switch(location){
            case "land":
            case "sea":
            case "air":
                this.location = location;
                break;
            default :
                System.out.println("land, sea, air 중에서 입력하세요");
                return;
        }
    }
}
