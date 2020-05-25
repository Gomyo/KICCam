public class BlockMain01 {
    public static void main(String[] args) {
        System.out.println("시작");
        int num1 = 10;
        {
            System.out.println("중간");
            // local var
            // 재선언 불가능
            // int num1 = 30;
            int num2 = 20;

            System.out.println(num1);
            System.out.println(num2);
        }
        System.out.println("끝");
        // 이렇게 쓰면 지역변수를 갖다 쓰는 거라 에러남
        // Error occured because num2 is local variable in block "중간"
        // System.out.println(num2);
    }
}