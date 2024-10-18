package Model;

import java.util.List;

//Clase refetente a Corte/Periodo
public class GradingPeriod {
    
    private int id;
    private int number;
    private List<Activities> activities;
    private double finalGrade;

    public GradingPeriod(int id, int number, List<Activities> activities, double finalGrade) {
        this.id = id;
        this.number = number;
        this.activities = activities;
        this.finalGrade = finalGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    

    

}
