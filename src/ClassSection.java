import java.util.ArrayList;

public class ClassSection {

    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList<>();

    public ClassSection(String subject, int capacity,int yearLevel)
    {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;

    }


    public void addStudent(Student currStudent)
    {
        boolean add = true;

        for(Student thisStudent : students)
        {
            if(currStudent.equals(thisStudent))
            {
                add = false;
            }
        }

        if(yearLevel == currStudent.getYearLevel() && add)
        {
            students.add(currStudent);
        }

        System.out.println(students.size());

    }

    public void removeStudent(Student student)
    {
        students.remove(student);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students + "}";
    }
}
