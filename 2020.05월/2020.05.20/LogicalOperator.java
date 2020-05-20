public class LogicalOperator {
    public static void main(String[] args) {
        /*
            AND,OR 연산 / SHORT CIRCUIT 연산자
        논리곱 : & / &&
        논리합 : | / ||

        a&b = 둘다 true인지 false인지 확인함
        a&&b = 한쪽이 false이면 다른 한쪽 안봄
        */
        int a = 10;
        int b = 20;
        System.out.println((a+=10)>15 | (b-=10)>15);
        System.out.println("a = "+ a + ", b = " +b);

        a = 10;
        b = 20;
        // 뒤를 아예 안보기때문에 결과가 20/20이 나옴
        System.out.println((a += 10) > 15 || (b -= 10) > 15);
        System.out.println("a = " + a + ", b = " + b);
    }
}