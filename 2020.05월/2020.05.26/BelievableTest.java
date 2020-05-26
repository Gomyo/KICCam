class BelievableUserInfo {
    private String name = "최준원";
    private int account = 1000000000;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
        else {
            System.out.println("부적절한 접근입니다 : " + name + " Access Denied.");
        }
    }

    public int getAccount() {
        return this.account;
    }
    public void setAccount(int account) {
        if (account > 0) {
            this.account = account;
        }
        else {
            System.out.println("부적절한 접근입니다 : " + account + " Access Denied.");
        }
    }
}

public class BelievableTest {
    public static void main(String[] args) {
        BelievableUserInfo info = new BelievableUserInfo();
        // 이와 같은 직접적인 접근은 불가능
        // System.out.printf("사용자 정보:%s, %d%n", info.name, info.account);
        System.out.printf("사용자 정보:%s, %d%n", info.getName(),info.getAccount());

        info.setName(null);
        info.setAccount(-10000);
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
    }
}