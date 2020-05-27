abstract class TestA {
    // abstract method
    public abstract void test();
}

class TestD extends TestA {
    public void test() {}
}
// 추상(abstract)이 붙어 있으면 이 자체로는 절~대 인스턴스화가 안된다.
// 상속을 통해서만 구현이 가능
// 즉, 자식을 통해서 부모의 구현이 가능하다!

// 어차피 조상 레벨에서 정의할 수 없는 것 : 예를 들어 붕어빵의 재료를 든다면 붕어빵에 재료를 넣는다는 것만 메서드로 선언해 두고 자손이 오버라이드 해야 함
abstract class TestB {
    TestB() {
        System.out.println("TestB Constructor");
    }
}
class TestC extends TestB {
    TestC() {
        System.out.println("TestC const");
    }
}



public class TestMain {
    public static void main(String[] args) {
        // TestA a = new TestA();
        // TestC c = new TestC();
        TestD d = new TestD();
    }
}