class Constructor02 {
    String name;
    // If there's nothing in Constructor, compiler creates default Constructor.
    Constructor02() {
        System.out.println("생성자 호출");
        // 멤버 변수 초기화
        name = "홍길동";
    }
    // Constructor Overloading
    Constructor02(String data) {
        name = data;
    }
}
public class ConstructorMain02 {
    public static void main(String[] args) {
        // Constructor02() - Default Constructor
        Constructor02 c = new Constructor02();
        System.out.println(c.name);

        Constructor02 c1 = new Constructor02();
        System.out.println(c1.name);
    }
}