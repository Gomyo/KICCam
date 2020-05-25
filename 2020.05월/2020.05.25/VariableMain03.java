class Variable03 {
    // 클래스 간의 공유를 위한 목적으로 static을 사용한다.
    
    static String name1;
    String name2;

    static void doFunc1() {
        System.out.println("doFunc1");

        Variable03 v = new Variable03();
        System.out.println(v.name2);
    }
    void doFunc2() {
        System.out.println("doFunc2");
    }
}
public class VariableMain03 {
    // 이건 그냥 사용 가능. 같은 static이라
    static String name1;
    // 멤버변수 name 설정. 같은 class 내에 있다고 바로 사용할 수 없다. It needs Instantiate
    String name2 = "스때틱";
    public static void main(String[] args) {
        // 179p 참조
        // System.out.println(Variable03.name1);
        // // Cannot make a static reference to the non-static field
        // // System.out.println(Variable03.name2);
        // // 그런데 인스턴스화를 거치고 나면
        // Variable03 v = new Variable03();
        // // 출력이 둘 다 된다
        // System.out.println(v.name1); // 그러나 static을 이렇게 쓰는 것은 좋은 방법은 아님
        // // System.out.println(Variable03.name1); 으로 쓰는 것이 static way (declaring type)
        // System.out.println(v.name2);
        
        // Variable03 v1 = new Variable03();
        // System.out.println(v1.name1);

        // v1.name1 = "홍길동";

        // System.out.println(v1.name1);
        // System.out.println(v.name1);
        // System.out.println(Variable03.name1);
        Variable03.doFunc1();
        // Instantiate
        Variable03 v = new Variable03();
        v.doFunc2();
        VariableMain03 v3 = new VariableMain03();
        System.out.println(v3.name2);



    }
}