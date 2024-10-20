package Model;

import java.util.List;

//Clase referente a Materia
public class Subject {

    private int id;
    private String name;
    private List<GradingPeriod> gradingPeriod;

    public Subject(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GradingPeriod> getGradingPeriod() {
        return gradingPeriod;
    }

    public void setGradingPeriod(List<GradingPeriod> gradingPeriod) {
        this.gradingPeriod = gradingPeriod;
    }


    @Override
    public String toString() {
        return "Subject: \n" +
               "ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Grading Period: " + gradingPeriod + "\n";
    }

    

}
