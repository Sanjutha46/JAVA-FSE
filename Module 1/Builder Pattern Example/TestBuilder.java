public class TestBuilder {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder()
                .setName("Sanju")
                .setAge(21)
                .setDepartment("CSE")
                .setEmail("sanju@gmail.com")
                .build();

        student.display();
    }
}
