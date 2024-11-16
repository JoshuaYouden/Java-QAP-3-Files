public class Demo {
    static void main(String[] args) {
        Person Ryan = new Person("Ryan English", 21, "Male");
        System.out.println();
        System.out.println(Ryan);

        Student Osaa = new Student("Osaa Rourke", 20, "Female", "HS95129", 3.5);
        System.out.println(Osaa);

        Teacher John = new Teacher("John Clain", 35, "Male", "Math", 50000.00);
        System.out.println(John);

        CollegeStudent Irma = new CollegeStudent("Irma Bell", 20, "Female", "UCB123", 4.5, "Software Development", 1);
        System.out.println(Irma);
    }
}
