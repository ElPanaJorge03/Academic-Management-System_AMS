
package Model;

import java.util.List;

/**
 *
 * @author Jorge
 */
//Clase referente a Estudiante
public class Student extends Person implements ComparableObject{

    private List<Activities> activities;
    private List<Attendance> attendances;


    Student(Person data, List<Activities> activities) {
        super(data);
        this.activities = activities;
    }

    public Student(String names, String surnames, int identification, int id) {
        super(names, surnames, identification, id);
        
    }
   
    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    @Override
    public int compareTo(ComparableObject other) {
        if (other instanceof Student) {
            return Integer.compare(this.id, ((Student) other).id);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: \n" +
               "ID: " + id + "\n" +
               "Names: " + names + "\n" +
               "Surnames: " + surnames + "\n" +
               "Identification: " + identification + "\n" +
               "Activities: " + activities + "\n" +
               "Attendances: " + attendances + "\n";
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    } 

    
    
    
}
