class Variable02 {
    int instanceData;
    static int classData;

    // 지역변수를 초기화 하는 방법 2 : 파라미터 설정, int data=a; doFunc에 10 넣어서 실행
    void doFunc(int a) {

        // 지역변수를 초기화하는 방법 1 : 값을 부여
        // int data = 0;
        int data=a;
        System.out.println(data);
        System.out.println(instanceData);
        System.out.println(classData);

        // 초기값. 멤버변수 값 넣기
        instanceData = a;
        classData = a;
        
        System.out.println(instanceData);
        System.out.println(classData);
    }
}

public class VariableMain02 {
    public static void main(String[] args) {
        Variable02 v = new Variable02(); // 여기서 Variable02() : 생성자
        v.doFunc(10);
        // 함수를 썼으면 여기서 이래도 쓸모가 없음
        
    }
}