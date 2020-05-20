public class CompareOperator {
    public static void main(String[] args) {
        System.out.println('A'>'B'); // 65>66
        // 비교 연산에서의 형변환
        // int 이하의 연산 - 일단 int로 변경
        System.out.println('A'==65);
        // 두 피연산자 중 큰 타입으로 형변환 : 3.0 ==3.0
        System.out.println(3 == 3.0);

        // 주의 사항 : 0.1의 표현 문제
        System.out.println(0.1 + " : "+ 0.1f + " : "+(0.1==0.1f)); // float가 double로 형변환되면서 0.1보다 약간 큰 근사값을 가지므로 false.
        System.out.println(0.5 + " : " + 0.5f + " : " + (0.5 == 0.5f)); // 근데 이거는 또 true로 평가된다.
        double d1 = 0.1;
        float f1 = 0.1f;
        System.out.println((int)(d1*10)==(int)(f1*10));
        System.out.println((float)d1==f1);

        // 결과
        // false
        // true
        // true
        // 0.1 : 0.1 : false
        // 0.5 : 0.5 : true
        // true
        // true
    }
}