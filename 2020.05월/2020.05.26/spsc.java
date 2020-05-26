package p1;

public class spsc {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.useMember();

        // 같은 패키지의 다른 클래스 : private member에 접근 불가
        p.publicVar = 10;
        p.protectVar=10;
        p.defaultVar=10;
        // p.privVar = 10;

        spcc c = new spcc();
        c.useMember();
    }        
}