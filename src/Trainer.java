public class Trainer extends Person {
    private final String specialization;

    public Trainer(String name, String surname, int age, String specialization) {
        super(name, surname, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Trainer{" + super.toString() +
                ", specialization='" + specialization + '\'' +
                '}' ;
    }
}
