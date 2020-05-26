// final class Parent {
//     final String data1 = "test1";
//     String data2;

//     //final을 붙이면 child에서 상속 불가. 메서드 레벨에서 final 클래스의 제한을 한 것.
//     void viewParent() {
//         System.out.println("pvP");
//     }
// }

// class Child extends Parent {
//     void viewParent() {
//         System.out.println("cvP");
//     }
// }
// public class ModifierMain01 {
//     public static void main(String[] args) {
//         // Parent p = new Parent();
//         // System.out.println(p.data1);
//         // System.out.println(p.data2);
//         // p.viewParent();
//         // p.data1 = "test";
//         // p.data2 = "test";
        
//         Child c = new Child();
//         c.viewParent();
//     }
// }