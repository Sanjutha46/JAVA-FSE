public class TestFactoryMethod {

    public static void main(String[] args) {

        IDCardFactory factory = new IDCardFactory();

        IDCard studentCard = factory.createIDCard("Student");
        studentCard.generate();

        IDCard teacherCard = factory.createIDCard("Teacher");
        teacherCard.generate();
    }
}
