public class forStar02 {
    public static void main(final String[] args) {
        for (int i=1; i<=10; i++) {
            for (int j=65; j<=64+i; j++) {
                System.out.print((char)j);
            }
            System.out.println("");
        }
    }
}