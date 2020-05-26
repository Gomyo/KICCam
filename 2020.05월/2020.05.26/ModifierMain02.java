class mParent {
    private String data1 = "test1";

    // 제어문을 통해 멤버 변수와 관련된 입력 데이터 관리
    // 변수명은 보통 정해져 있음.
    // setter - setData1
    public void setData1(String data1) {    
        this.data1 = data1;
    }
    // getter - getData1
    public String getData1() {
        return data1;
    }
}

public class ModifierMain02 {
    public static void main(String[] args) {
        mParent mp = new mParent();
        // private을 이렇게 직접 수정하려 하면 안됨. 에러뜸
        // mp.data1 = "test2";

        // 멤버변수는 항상 메서드를 통해서 건드려야 함
        mp.setData1("test2");
        System.out.println(mp.getData1());
    }
}