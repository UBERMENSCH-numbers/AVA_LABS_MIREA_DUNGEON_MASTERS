package Pr_6_____;


public class Student {
    int id;
    int GPA;

    public Student(int id) {
        this.id = id;
        GPA = (int) (Math.random() * 100);
    }

    @Override
    public String toString() {
        return "Student " +
                + id +
                ", GPA=" + GPA;
    }
}

