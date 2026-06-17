public class Student {

    private String name;
    private int age;
    private String department;
    private String email;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.email = builder.email;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
    }

    public static class StudentBuilder {

        private String name;
        private int age;
        private String department;
        private String email;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
