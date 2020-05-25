class Method04 {
    void doFunc(){
        System.out.println("doFunc");
    }
    void doFunc(int data) {
        System.out.println("doFunc(data)");
    }

    // 이거는 Overloading이 안됨
    // 중복 - Overloading의 기준은 parameter, argument
    // int doFunc(int data) {
    //     System.out.println("doFunc(int)");
    //     return 3;
    // }
    
    // param 다른것
    void doFunc(int data1, int data2) {
        System.out.println("doFunc(d1,d2)");
    }
    // 자료형이 다른것
    void doFunc(int data1, float data2) {
        System.out.println("doFunc(d1,d2f)");
    }
}
public class MethodMain04 {
    public static void main(String[] args) {
        Method04 me = new Method04();
        me.doFunc();
        me.doFunc(30);
        me.doFunc(30,40);
        me.doFunc(30,3.0f);
    
    }
}