// class Person /*생략 : extends Object*/{
//     String name;
//     // 주소를 알아보기 위해 Constructor 생성
//     Person() {
//         // this를 쓰면 주소
//         System.out.println("Person : " + this);
//     }

//     void viewPerson() {
//         System.out.println("viewPerson");
//     }
//     void eat() {
//         System.out.println("Eat");
//     }
//     void jump() {
//         System.out.println("Jump");
//     }
// }

// class SpiderMan extends Person{
//     boolean isSpider;
//     SpiderMan() {
//         System.out.println("SpiderMan : " + this);
//     }
//     void fireWeb(){
//         System.out.println("히히 거미줄 발싸!");
//     }
    
//     // 이렇게 쓰면 오버라이딩이아니라 오버로딩
//     void viewPerson(int a) {
//         System.out.println("viewPerson(int)");
//     }
// }

// class ChildSpiderMan extends SpiderMan {
//     ChildSpiderMan() {
//         System.out.println("ChildSpiderMan : " + this);
//     }
// }

// public class ClassMain01 {
//     public static void main(String[] args) {
//         Person p = new Person();
//         p.name = "홍길도웅";
//         System.out.println(p.name);
//         // 태초의 부모인 Object로부터 받은 참조
//         System.out.println(p.toString());

//         SpiderMan sm = new SpiderMan();
//         sm.isSpider = true;
//         sm.name = "PETER";
//         System.out.println(sm.name);
//         System.out.println(sm.isSpider);

//         ChildSpiderMan csm = new ChildSpiderMan();
//         csm.name = "peter";
//         System.out.println(csm.name);

//         p.viewPerson();
//         sm.viewPerson();
//         csm.viewPerson();

//         p.eat();
//         sm.eat();
//         csm.eat();

//         sm.fireWeb();
//         csm.fireWeb();
//     }
// }