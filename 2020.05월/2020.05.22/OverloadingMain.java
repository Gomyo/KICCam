class Overloading {
    // 같은 이름의 메서드 명을 사용못함
    // 그럼 input 자료의 형태(인자)를 바꾸면?
    // 된다! 이 관계를 Overloading이라고 한다.
    void doFunc01(int a) {
        System.out.println("dofunc1 1");
    }
    void doFunc01(float a) {
        System.out.println("dofunc2 2");
    }
    
    void doFunc01(float a, int b) {
        System.out.println("dofunc2 3");
    }

    void doFunc01(int a, float b) {
        System.out.println("dofunc2 4");
    }
}
public class OverloadingMain {
    public static void main(String[] args) {
        Overloading ol = new Overloading();

        ol.doFunc01(3);
        ol.doFunc01(4.0f);
        ol.doFunc01(3.0f, 4);
        ol.doFunc01(3, 4f);
    }
}