public class Principal {

    private static Principal instance;

    private Principal() {
        System.out.println("Principal Appointed");
    }

    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }

    public void announce() {
        System.out.println("Good Morning Students!");
    }
}
