public class InitiallizerTest {
    int iv;
    static int cv;

    static { // 클래스 초기화 블록 : static 멤버 변수 초기화
        System.out.println("Static initializer");
        cv = 100;
    }

    { // 인스턴스 초기화 블록
        System.out.println("Instance init");
        iv = 300;
    }

    public InitiallizerTest() { // 파라미터 없는 생성자
        System.out.printf("constructor iv: %d, cv: %d%n", iv, cv);
    }
    public static void main(String[] args) {
        InitiallizerTest it = new InitiallizerTest();
        System.out.printf("객체 1 생성 후 - cv: %d, iv: %d%n", InitiallizerTest.cv, it.iv);
        InitiallizerTest it2 = new InitiallizerTest();
        System.out.printf("객체 2 생성 후 - cv: %d, iv: %d%n", InitiallizerTest.cv, it2.iv);
        
    }
}