public class CollegeStudent extends Student{
    protected String major;
    protected int year;

    public CollegeStudent(String name, int age, String gender, String myIdNum, double myGPA, String major, int year) {
        super(name, age, gender, myIdNum, myGPA);
        this.major = major;
        this.year = year;
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method
    public String toString() {
        return super.toString() + ", major: " + major + ", year: " + year;
    }
}
