public class TestObserver {

    public static void main(String[] args) {

        ResultSystem resultSystem = new ResultSystem();

        Student student1 = new Student("Sanju");
        Student student2 = new Student("Rahul");

        resultSystem.addStudent(student1);
        resultSystem.addStudent(student2);

        resultSystem.publishResult();
    }
}
