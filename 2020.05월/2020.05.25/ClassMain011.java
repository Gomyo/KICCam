class Person /* 생략 : extends Object */ {
    void viewPerson() {
        System.out.println("viewPerson");
    }
}

class SpiderMan extends Person {
    // 이렇게 쓰면 오버라이딩이아니라 오버로딩
    void viewPerson(int a) {
        System.out.println("viewPerson(int)");
    }
}

class ChildSpiderMan extends SpiderMan {
}

public class ClassMain011 {
    public static void main(String[] args) {
        Person p = new Person();
        SpiderMan sm = new SpiderMan();
        ChildSpiderMan csm = new ChildSpiderMan();

        p.viewPerson();
        sm.viewPerson();
        sm.viewPerson(3);
        csm.viewPerson();
    }
}