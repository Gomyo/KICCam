import java.util.Arrays;

public class initArray {
    public static void main(String[] args) {
        // 배열 생성하면서 초기화
        int [] arr1 = new int [5];

        arr1[0] = 10;
        arr1[1] = 10;
        arr1[2] = 10;
        arr1[3] = 10;
        arr1[4] = 10;

        for (int i=0; i<arr1.length; i++) {
            arr1[i] = i+1;
        }
        // 배열을 출력하는 두 가지 방법.
        System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.deepToString(arr1));

        int[] arr2 = new int[]{10,20,30,4,535};
        int[] arr3 = { 10, 20, 30, 4, 535 };

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); // 0 : default
        }
        // 향상된 for문 : for each 문. 초기값과 증감식을 사용하지 않으며 배열이 가지고 있는 요소들을 특정 변수로 바로 할당해서 사용할 수 있게 한다.
        for (int data : arr3) {
            System.out.println(data);
        }

    }
}   