public class IDCardFactory {

    public IDCard createIDCard(String type) {

        if(type.equalsIgnoreCase("Student")) {
            return new StudentIDCard();
        }

        if(type.equalsIgnoreCase("Teacher")) {
            return new TeacherIDCard();
        }

        return null;
    }
}
