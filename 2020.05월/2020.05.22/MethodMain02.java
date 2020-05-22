class MethodEx02 {
    void doGugudan(int dan) {
        for (int i=1; i<10; i++) {
            // 형식 + => printf
            // System.out.println(dan + "X" + i + "=" + (dan*i));
            System.out.printf("%sX%s=%s%n", dan,i,(dan*i));
        }
    }
    // Test
    void doGugudan2(int start, int end) {
        for (int i = start; i<=end; i++) {
            for (int j=1; j<10; j++) {
                // \t를 붙이면 결과가 깔끔해진다!
                // %t는 bash ?: Is a directory err가 발생하므로 쓰지 말 것
                System.out.printf("%sX%s=%s\t",i,j,(i*j));
            }
            System.out.println();
        }
    }
}
public class MethodMain02 {
    public static void main(String[] args) {
        MethodEx02 me = new MethodEx02();
        me.doGugudan(5);

        MethodEx02 test = new MethodEx02();
        test.doGugudan2(3, 4);
    }
}