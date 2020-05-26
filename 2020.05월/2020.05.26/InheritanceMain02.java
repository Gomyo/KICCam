// class Parent1 {
//     // Constructor가 param을 받으면
//     Parent1(int a) {
//         System.out.println("boomo Const" + this);
//     }
// }

// class Child1 extends Parent1 {
//     // implicit super constructor Parent is undefined.
//     Child1() {
//         // 그래서 강제로 받아 오려면
//         super(10); // super는 항상 맨 앞에.
//         System.out.println("jasik Const" + this);
//     }
// }
// public class InheritanceMain02 {
//     public static void main(String[] args) {
//         Child c = new Child();
//     }
// }