public class parseint {
    public static void main(String[] args) {
        // 문자열로 받아들인 것을 숫자로 바꾸려면 integer.parseint(arg)로 해야 함.
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}