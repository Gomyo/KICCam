class Person2 {
    String name;
    Person2(String name) {
        //super(); // Object의 기본 생성자 호출
        this.name = name;
        System.out.println("Person2 끝");
    }
}
public class SpiderMan3 extends Person2{
    boolean isSpider;

    SpiderMan3(String name,boolean isSpider) {
        super(name);
        this.isSpider = isSpider;
        System.out.println("SpiderMan3(str, spi, ispi) 끝");
    }
    
    SpiderMan3(String name) {
        this(name,true) ;
        System.out.println("SpiderMan3(String name) 끝");
    }

    public static void main(String[] args) {
        SpiderMan3 sman = new SpiderMan3("Perter Parker");
    }
    
}