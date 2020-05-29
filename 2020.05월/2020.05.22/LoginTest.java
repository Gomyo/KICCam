class LoginResult {
    boolean result;
    String msg;
    
    public void printResult() {
        System.out.println(this.result + " : " + this.msg);
    }

}

class LoginSystem {
    public LoginResult doLogin(String id, String pass){
        LoginResult result1 = new LoginResult();
        if (id.equals("admin") && pass.equals("12345")) {
            result1.result = true;
            result1.msg = id + "님 하이여 ㅎㅎ";
        }
        else if (!id.equals("admin")) {
            result1.msg = "아이디가 틀렸음";
        }
        else {
            result1.msg = "아이디는 맞지만 비번이 틀림";
        }
        return result1;
    }
}


public class LoginTest {
    public static void main(String[] args) {
        Login login = new Login();
        LoginResult result = login.doLogin("hong","12345");
        result.printResult();

        result = login.doLogin;
    }
}