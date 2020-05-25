class Initial01 {
    String hakbun;
    String name;

    Initial01 () {
        this("1001","아무개");
    }

    Initial01(String hakbun) {
        // this.hakbun = hakbun;
        // this.name = name;
        // this를 통한 생성자 호출은 생성자의 맨 처음 행에서만 가능하다. 
        this(hakbun, "아무개");
        System.out.println("생성자 호출");
    }
    Initial01 (String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }
}
public class InitialMain01 {
    public static void main(String[] args) {
        Initial01 i = new Initial01("2014","최준원");
        // Initial01 i = new Initial01("준주누주");
        // Initial01 i = new Initial01();
        System.out.println(i.hakbun);
        System.out.println(i.name);
    }
}