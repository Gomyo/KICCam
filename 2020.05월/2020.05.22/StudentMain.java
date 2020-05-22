public class StudentMain {
    public static void main(String[] args) {
        // 인스턴스 선언
        Student s1;

        // 인스턴스 생성
        s1 = new Student();

        // 인스턴스 사용
        s1.hakbun = "1001";
        s1.name = "joon";
        s1.age = 30;
        
        System.out.println(s1.hakbun);
        System.out.println(s1.name);
        System.out.println(s1.age);

        // s2에는 s1의 참조주소값이 들어가있다. print 해보면, 두 주소 값이 같다!
        Student s2 = s1;

        System.out.println(s2);
        System.out.println(s1);

        s2.hakbun = "2002";

        System.out.println(s2);
        System.out.println(s2.hakbun);
    }
}