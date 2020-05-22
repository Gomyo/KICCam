class MethodEx03 {
    void doFunc01() {
        System.out.println("dofunc1 ~");
    }
    static void doFunc02() {
        System.out.println("dofunc2 static~");
    }
}
public class MethodMain03 {
    public static void main(String[] args) {
        MethodEx03 me = new MethodEx03();

        me.doFunc01();
        me.doFunc02();

        MethodEx03.doFunc02();
    }
}