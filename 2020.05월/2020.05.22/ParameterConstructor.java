public class ParameterConstructor {
    String name;
    int age;
    boolean isHungry;

    // param Constructor : default constructor isn't created anymore.
    ParameterConstructor(String n, int a, boolean i) {
        name = n;
        age = a;
        isHungry = i;
    }
    // 한번에 출력이 안 될리가 있나! 한번에 출력해주는 메서드를 만들고 호출하면 된다!
    void printinfo() {
        System.out.println(name+age+isHungry);
    }
    public static void main(String[] args) {
        // if you wanted to print parameterConstructor's value:
        ParameterConstructor pp = new ParameterConstructor("최준원",26,false);
        System.out.print(pp.name);

        pp.printinfo();
        // Cuz there's no default constructor, so, the constructor ParameterConstructor() is undefined Error occured.
        // ParameterConstructor p = new ParameterConstructor();\
         
    }
}