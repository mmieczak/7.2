public class Tester {
    /*Zamodeluj następującą rzeczywistość, tworząc w programie odpowiednie klasy.
    Program przeznaczony jest dla firmy prowadzącej rozmaite szkolenia.
    W systemie będą przechowywane informacje zarówno o prowadzących jak i studentach.
    Powinna też istnieć klasa reprezentująca grupę zajęciową.
    Grupa powinna mieć przypisanego prowadzącego oraz potencjalnie wielu studentów.

    W klasie testowej utwórz grupę z przypisanym prowadzącym i co najmniej dwoma studentami.
    Wyświetl pełne informacje na temat grupy w konsoli.*/

    public static void main(String[] args) {

        //Create container for Trainers, register 3 trainers
        Trainer[] trainersContainer = new Trainer[3];
        trainersContainer[0] = new Trainer("Bill", "Clinton", 60, "Cognitive Learning");
        trainersContainer[1] = new Trainer("Lech", "Walesa", 70, "Leadership");
        trainersContainer[2] = new Trainer("Gall", "Anonim", 50, "Standup");


        //Create table containing beginners students, register student & assign students to groups
        Student[] beginnerStudents = new Student[3];
        beginnerStudents[0] = new Student("Tom", "Buschalka", 30);
        beginnerStudents[1] = new Student("Elen", "Moore", 18);
        beginnerStudents[2] = new Student("Elvis", "Presley", 50);

        Student[] advancedStudents = new Student[3];
        advancedStudents[0] = new Student("Tom", "Cruise", 66);
        advancedStudents[1] = new Student("Arnold", "S", 24);
        advancedStudents[2] = new Student("Mac", "Spencer", 32);


        //Create container for lecture groups, register 3 groups
        StudentGroup[] studentGroups = new StudentGroup[3];
        studentGroups[0] = new StudentGroup("Beginners", "Monday", trainersContainer[0], beginnerStudents);
        studentGroups[1] = new StudentGroup("Medium", "Wednesday", trainersContainer[1], advancedStudents);


        printTrainerContainer(trainersContainer);

        printGroupContainer(studentGroups);
    }

    public static void printStudentContainer(Student[] students) {
        System.out.println("--------------------------------------");
        System.out.println("\nList of Students:");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void printTrainerContainer(Trainer[] trainers) {
        System.out.println("--------------------------------------");
        System.out.println("\nList of Trainers:");
        for (Trainer trainer : trainers) {
            if (trainer != null) {
                System.out.println(trainer);
            }
        }
    }

    public static void printGroupContainer(StudentGroup[] groups) {
        System.out.println("--------------------------------------");
        System.out.println("\nList of Groups:");
        for (StudentGroup group : groups) {
            if (group != null) {
                System.out.println(group);
            }
        }
    }
}

