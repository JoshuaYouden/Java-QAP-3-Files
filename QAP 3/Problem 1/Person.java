public class Person {
    // Attributes
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Constructor
    public Person(String name, int age, String myGender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = myGender;
    }

    // Getters
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setters
    public void setName(String name) {
        this.myName = name;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    // Method
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}