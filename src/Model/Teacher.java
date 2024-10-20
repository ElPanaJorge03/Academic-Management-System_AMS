package Model;

import java.util.List;

//Clase referente a Profesor
public class Teacher extends Person implements ComparableObject{
    
    private List<Subject> subjects;

    public Teacher(Teacher data) {
        super(data);
    }
    
    public Teacher(String names, String surnames, int identification, int id) {
        super(names, surnames, identification, id);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int compareTo(ComparableObject other) {
        if (other instanceof Teacher) {
            return Integer.compare(this.id, ((Teacher) other).id);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Teacher: \n" +
               "ID: " + id + "\n" +
               "Names: " + names + "\n" +
               "Surnames: " + surnames + "\n" +
               "Subjects: " + subjects + "\n" +
               "Identification: " + identification + "\n";
    }

    
}
