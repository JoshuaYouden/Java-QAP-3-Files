public class Student extends Person{
    // Attributes
    protected String myIdNum;
    protected double myGPA;

    // Constructor
    public Student(String name, int age, String myGender, String myIdNum, double myGPA) {
        super(name, age, myGender);
        this.myIdNum = myIdNum;
        this.myGPA = myGPA;
    }
}
