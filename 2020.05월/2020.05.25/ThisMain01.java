class This01 {
    // 여기를 추가해야 name cannot be resolved or is not a field 에러가 안뜸
    // 멤버변수를 선언해 둬야 생성자의 지역변수를 선언할 수 있다? ㄴㄴ Q1로
    String name = "홍길동";
    
    This01() {
        System.out.println("Call Constructor");
        // 1. 지역변수
        // 2. 메서드 접근
        String name = "주논";
        // 맨 처음 String 변수가 없으면 name cannot be resolved or is not a field Error occured
        System.out.println(this.name);
        System.out.println(name);        
    }
    This01(String name) {
        // Q1. 여기서 name을 받아서 멤버 변수에 넣는 것. 넣을 자리를 만들어 줘야 넣을 수 있으니 class에서 멤버면수를 선언해 주지 않으면 에러가 나는 것!
        this.name = name;
        this.doFunc();
        System.out.println(name);
    }
    void doFunc() {
        System.out.println("doFunc");
    }
}
public class ThisMain01 {
    public static void main(String[] args) {
        This01 t = new This01();
        This01 te = new This01("no");
        System.out.println(te);
        System.out.println(te.name);
    }
}