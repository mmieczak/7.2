public class Tester {
    /*Przemodeluj poprzednią aplikację w taki sposób, aby istniała możliwość nadania studentowi oceny w danej grupie
    zajęciowej.
    Weź pod uwagę fakt, że student może w tej szkole uczestniczyć w wielu różnych zajęciach.

    Utwórz co najmniej dwie grupy oraz studenta, który jest do nich zapisany.
    Przypisz mu dwie różne oceny w dwóch różnych grupach.
    Wyświetl historię ocen studenta uwzględniające wszystkie jego zajęcia*/

    public static void main(String[] args) {

        //Create container for Trainers, register 3 trainers
        Trainer[] trainersContainer = new Trainer[3];
        trainersContainer[0] = new Trainer("Bill", "Clinton", 61, "Cognitive Learning");
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

        //Assign marks for students
        beginnerStudents[0].setMark("3");
        beginnerStudents[1].setMark("4");
        beginnerStudents[2].setMark("2");

        //Assign marks for students
        advancedStudents[0].setMark("1");
        advancedStudents[1].setMark("5");
        advancedStudents[2].setMark("6");

        //Create container for lecture groups, register 3 groups
        StudentGroup[] studentGroups = new StudentGroup[3];
        studentGroups[0] = new StudentGroup("Beginners", "Monday", trainersContainer[0], beginnerStudents);
        studentGroups[1] = new StudentGroup("Advanced", "Wednesday", trainersContainer[1], advancedStudents);

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

