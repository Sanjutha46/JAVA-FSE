public class TestPrincipal {

    public static void main(String[] args) {

        Principal p1 = Principal.getInstance();
        Principal p2 = Principal.getInstance();

        p1.announce();

        System.out.println("Same Principal: " + (p1 == p2));
    }
}
