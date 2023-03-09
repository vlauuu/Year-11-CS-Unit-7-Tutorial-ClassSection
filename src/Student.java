public class Student {

    private int id;
    private boolean firstCount = true;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;

    public Student (String firstName, String lastName, int age, int yearLevel)
    {
        if(firstCount)
        {
            firstCount = false;
            id = 1;
        }

        this.id = id;
        id = id + 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFirstCount() {
        return firstCount;
    }

    public void setFirstCount(boolean firstCount) {
        this.firstCount = firstCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }


    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
    }
}
