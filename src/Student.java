public class Student extends Person {

    private String mark;

    public Student(String name, String surname, int age) {
        super(name, surname, age);
        this.mark = null;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", age=" + this.getAge() + '\'' +
                ", mark=" + mark +
                '}' ;
    }
}
