public class OperatorEx01 {
    public static void main(String[] args) {
        short s1 = 10;
        byte s2 = 20;
        // 산술연산자 : int 보다 높은 형으로 변환

        // int sum1 = s1+s2
        // int 이하인 short이기에 자동으로 int형변환이 되어버림
        // int 이하면 int로 올리고, 그 이상은 그 이상으로 됨

        short sum1 = (short)(s1+s2);

        System.out.println(sum1);
        
        int i1 = 10;
        int i2 = 20;
        int sum2 = i1 + i2;
        System.out.println(sum2);

        int j1 = 1_000_000;
        int j2 = 1_000_000;
        // overflow
        int product1 = j1 * j2; // -727379968
        // 하나를 long으로 형변환 해줘야 하지롱
        long product2 = (long)j1 * j2;
        System.out.println(product1);
        System.out.println(product2);
        // 2.5
        System.out.println(5/(double)2);
        System.out.println(5/2.);
        System.out.println(5/2); // 2
    }
}