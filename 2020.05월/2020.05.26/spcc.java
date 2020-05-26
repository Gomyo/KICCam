package p1;

public class spcc extends Parent{

    public void useMember() {
        // 같은 패키지 자식 클래스
        this.publicVar = 10;
        this.protectVar = 10;
        this.defaultVar = 10;
        // 같은 패키지 일반 클래스와 같이, private member는 접 근 불가
        // this.privVar = 10;
    }
}