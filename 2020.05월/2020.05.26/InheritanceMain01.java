// // this, super
// class Parent {
//     String p = "Parent";
//     // Create Parent Constructor
//     Parent() {
//         System.out.println("boomo Const" + this);
//     }
//     void viewParent() {
//         System.out.println("boo-mo");
//     }
// }

// class Child extends Parent {
//     // String p = "자식";
//     Child() {
//         System.out.println("jasik Const" + this);
//         // 부모를 호출하고 싶으면
//         super.viewParent();
//     }
//     // Overriding
//     @Override
//     void viewParent() { 
//         System.out.println("Ja-sik"+this.p);
        
//         System.out.println("Ja-sik" + super.p);
//     }
//     // Overloading
//     // void viewParent() {
//     //     System.out.println("Ja-sik");
//     // }
// }
// public class InheritanceMain01 {
//     public static void main(String[] args) {
//         // Parent p = new Parent();
//         // p.viewParent();

//         Child c = new Child();
//         c.viewParent();
//     }
// }