import java.util.ArrayList;
import java.util.List;

public class ResultSystem {

    private List<Observer> students = new ArrayList<>();

    public void addStudent(Observer student) {
        students.add(student);
    }

    public void removeStudent(Observer student) {
        students.remove(student);
    }

    public void publishResult() {
        notifyStudents("Exam Results Published!");
    }

    private void notifyStudents(String message) {
        for (Observer student : students) {
            student.update(message);
        }
    }
}
