public class createEval {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        int result = 0;
        
        // if문은 안되는데, 그 이유는 ifelse로 문자열을 비교하려면 다른 방식으로 해야 하기 때문
        // if (args[1] == "+") {
        //     result = a + b;
        // }
        // else if (args[1] == "-") {
        //     result = a - b;
        // }
        // else if (args[1] == "/") {
        //     result = a / b;
        // }
        // else if (args[1] == "*") {
        //     result = a * b;
        // }
        switch (args[1]) {
            case "+":
                result = a + b;
                break;  
            case "-":
                result = a - b;
                break;  
            case "/":
                result = a / b;
                break;  
            case "*":
                result = a * b;
                break;  
            default:
                break;
        }
        System.out.println(result);

    }
}