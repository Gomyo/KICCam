// class Calcal {
//     void add(int int1, int int2) {
//         System.out.println(int1+int2);
//     }
    
//     void sub(int int1, int int2) {
//         System.out.println(int1 - int2);
//     }
    
//     void mul(int int1, int int2) {
//         System.out.println(int1 * int2);
//     }
    
//     void div(int int1, int int2) {
//         System.out.println(int1 / int2);
//     }
// }
class util {
    void doCalcul (int num1, String oper, int num2) {
        int result = 0;
        switch(oper) {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Enter proper contents");
                break;
            }
        System.out.println(result);
    }
}

public class Calculator {
    public static void main(String[] args) {
        util me = new util();

        me.doCalcul(2, "-", 3);
    }
}

// public class Calculator {
//     public static void main(String[] args) {
//         Calcal cal = new Calcal();
        
//         switch (args[1]) {
//             case "+":
//                 cal.add(args[0], args[2]);
//                 break;
//             case "-":
//                 cal.sub(args[0], args[2]);
//                 break;
//             case "*":
//                 cal.mul(args[0], args[2]);
//                 break;
//             case "/":
//                 cal.div(args[0], args[2]);
//                 break;
//         }
//     }
// }
