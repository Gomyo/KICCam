class MethodEx01 {
    void doFunc01() {
        System.out.println("doFunc1 호출");
    }
    void doFunc02(int data1) {
        // 지역변수
        System.out.println("doFunc02 호출 : " + data1);
    }
    void doFunc03(int data1, int data2) {
        System.out.println(data1);
        System.out.println(data2);
    }
    // return이 있으면 돌려주고 싶은 자료형의 형태를 함수 앞에 붙여줘야 함.
    // return이 없으면 무적권 void
    int doFunc04(int data1, int data2) {
        int sum = data1 + data2;
        // 여기서 결과를 출력하는 것이 아니라, 이 메서드를 호출한 곳으로 돌려주고 싶다면
        return sum;
    }
}
public class MethodMain01 {
    public static void main(String[] args) {
        MethodEx01 me = new MethodEx01();
        // 메서드의 호출
        me.doFunc01();
        me.doFunc01();
        me.doFunc01();

        me.doFunc02(30);

        me.doFunc03(100,20);

        System.out.println(me.doFunc04(100,300));
    }
}