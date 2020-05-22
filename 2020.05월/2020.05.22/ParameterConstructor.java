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
    public static void main(String[] args) {
        // if you wanted to print parameterConstructor's value:
        ParameterConstructor pp = new ParameterConstructor("최준원",26,false);
        System.out.print(pp.name);
        // Cuz there's no default constructor, so, the constructor ParameterConstructor() is undefined Error occured.
        // ParameterConstructor p = new ParameterConstructor();\
        
    }
}