public class args {
    // main(String)을 int로 바꾸면 실행했을 때 클래스의 기본 메소드를 찾을 수 없다는 에러가 나타난다.
    public static void main(String[] args) {
        // System.out.println(args);

        for(int i=0; i<args.length; i++) {
            System.out.println(args[i]+'\t');
        }
        System.out.println();
    }
    // java args ~~ 하면 그걸 자동으로 받는다.
    // 문자열을 입력할 때 공백이 포함되어 있으면 반드시 ""로 묶어줘야 그대로 출력이 가능하다. 그렇지 않으면 알아서 split을 해버림
    

}