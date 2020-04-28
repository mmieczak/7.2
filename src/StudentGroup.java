import java.util.Arrays;

public class StudentGroup {
    String name;
    String lectureDay;
    Trainer trainer;
    Student[] students;

    public StudentGroup(String name, String lectureDay, Trainer trainer, Student[] students) {
        this.name = name;
        this.lectureDay = lectureDay;
        this.trainer = trainer;
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                ", lectureDay='" + lectureDay + '\'' +
                ", trainer=" + trainer +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
