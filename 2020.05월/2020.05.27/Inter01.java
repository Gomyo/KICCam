interface InterA {
    public static final String str1 = "gil";
    // static final이 자동으로 들어감
    public String str2 = "hong";

    public abstract void methodA();
}


interface InterB extends InterA {

}

interface InterC {
    public abstract void methodC();

}
// 다중 상속 가능
class ClassA implements InterB, InterC {
    // class ClassA implements InterA {
    public void methodA() {
        System.out.println("methodA");
    }
    
    public void methodC() {
        System.out.println("methodC");
    }
}

public class Inter01 {
    public static void main(String[] args) {
        // Inter A = new Inter();
        ClassA a = new ClassA();
        a.methodA();
        a.methodC();
    }
}