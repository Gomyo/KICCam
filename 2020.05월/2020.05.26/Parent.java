package p1;

public class Parent {
    public int publicVar;
    protected int protectVar;
    int defaultVar;
    private int privVar;

    // 같은 클래스 내부에서의 접근
    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        this.defaultVar = 10;
        this.privVar = 10;
    }
}