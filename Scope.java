package practice;

public class Scope {
    int iv;
    String st;

    void cal(){
        int iv;
        iv = 31; //로컬변수
        this.iv = 33; //필드
    }
}
