class Variable {
    String instanceVariable;
    static String classVariable = "nn";

}
// 자바 메서드에 클래스를 위에 올릴 수도 있다1
public class VariableMain {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        // Variable v2; // 저장공간을 만들지 않음
        
        v1.instanceVariable = "10";
        v1.classVariable = "20";

        System.out.println(v1.instanceVariable);
        System.out.println(v1.classVariable);
        
        // v2.instanceVariable = "10"; v2가 initialize 되지 않았다는 문제가 뜬다
        // v2.classVariable = "20";

        
        // Variable.instanceVariable = "20"; static이 있을때랑 없을때랑 저장영역이 다르ㅡ다.
        

        v1.instanceVariable = "aaa";
        v2.instanceVariable = "bbb";

        System.out.println(v1.instanceVariable); // aaa
        System.out.println(v2.instanceVariable); // bbb

        // Variable.classVariable = "20"; 
        // class 멤버 변수는 같은 클래스를 통해 만들어진 모든 객체가 공유하게 되므로 공유 변수라고도 불린다.
        
        // 클래스 멤버 변수는 변수가 개별 객체와 무관하기 때문에 객체가 아닌 클래스 이름으로 접근해야 한다. 물론 객체로도 접근 가능하지만,
        // 객체의 이름으로 클래스 멤버 변수에 접근하는 것은 클래스 멤버 변수를 사용하는 적절한 방법은 아니다. 이런 경우 컴파일러는
        // "The static field Variable.classVariable should be accessed in a static way" 라는 경고 메시지를 보낸다.

        v1.classVariable = "객체를 통한 부적절한 변경";
        System.out.println(v1.classVariable); // ccc
        System.out.println(v2.classVariable); // ccc


        Variable.classVariable = "클래스를 통한 적절한 변경";
        System.out.println(v1.classVariable); // ccc
        System.out.println(v2.classVariable);

        
    }
}