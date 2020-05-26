package p2;

import p1.Parent;

public class opcc extends Parent{
    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        // 다른 패키지의 자식 클래스에서는 
        // 패키지가 다르기 때문에 default member, 그리고 당연히 private에 접근 불가.
        // this.defaultVar = 10;
        // this.privVar = 10;
    }
}