public class Student extends Person {

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }
}
