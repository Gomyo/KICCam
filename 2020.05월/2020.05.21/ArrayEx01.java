public class ArrayEx01 {
    public static void main(String[] args) {
        // 배열 선언
        int[] arr1; // 1. 참조형 변수 arr1이 선언되었지만, 아직 어떤 것도 참조하지 않은 null 상태.  
        int arr2[];

        // System.out.println(arr1); 이렇게 쓰면 local variable이 initalize 되지 않았기 때문에 문제가 생긴다

        // 배열의 생성
        arr1 = new int[10]; // 2. 배열도 참조형이다. 여기서 new를 해야 초기화를 했다고 볼수 있음. 값이 들어간다.
        // 원소의 값 변경
        System.out.println(arr1); // 참조 주소값 출력
        arr1[0] = 10;
        arr1[1] = 20;
        // 이렇게 만든 10개의 인덱스의 내용은?
        for (int i=0; i<10; i++){
            System.out.println(arr1[i]); // 0 : default
        }
        

        
    }
}