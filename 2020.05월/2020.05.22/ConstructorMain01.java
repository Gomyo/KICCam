class Constructor {
    // 디폴트 생성자는 생략 가능 (컴파일러가 알아서 삽입해줌)
    // Constructor() {} <-이게 기본 생성자. 알아서 생성해줌
    // Constructor() {
    //     System.out.println("생성자 호출");
    // }
    String name;
    Constructor(String a) {
        name = a;
    }
}
public class ConstructorMain01 {
    public static void main(String[] args) {
        // Constructor c = new Constructor();
        Constructor c = new Constructor("홍홍");
        System.out.println(c.name);
    }
}