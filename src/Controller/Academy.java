/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.*;

/**
 *
 * @author Jorge
 */
public class Academy {

    Tree treeStudent;
    Tree treeTeacher;
    Tree treeSubject;
    Tree treeCourse;
    Tree treeGradingPeriod;
    Tree treeActivities;

    public Academy() {
        this.treeStudent = null;
        this.treeTeacher = null;
        this.treeCourse = null;
        this.treeSubject = null;
        this.treeActivities = null;
        this.treeGradingPeriod = null;
    }

    public void print(Tree tree) {
        if (tree != null) {
            print(tree.leftSon); // Recorre el subárbol izquierdo
            System.out.println(tree.data.toString()); // Imprime el dato del nodo actual (que será un estudiante)
            print(tree.rightSon); // Recorre el subárbol derecho
        }
    }

    public Tree addNode(Tree tree, ComparableObject newObject) {
        if (tree == null) {

            tree = new Tree(newObject);
            return tree;
        }

        if (newObject.compareTo(tree.data) < 0) {

            tree.leftSon = addNode(tree.leftSon, newObject);

        } else if (newObject.compareTo(tree.data) > 0) {

            tree.rightSon = addNode(tree.rightSon, newObject);
        }

        return tree;
    }

    public static void main(String[] args) {
        List<Student> studentsCourse = new ArrayList<>();
        List<Subject> subjectsTeacher = new ArrayList<>();
        List<Activities> activitiesStudent = new ArrayList<>();
        List<Activities> activitiesgradingPeriod = new ArrayList<>();
        List<Attendance> attendancesStudent = new ArrayList<>();
        List<Subject> subjectsCurriculum = new ArrayList<>();
        List<GradingPeriod>  gradingPeriodSubject = new ArrayList<>();

        Academy object = new Academy();

        // Actividades
        Activities a1 = new Activities(01, "Taller", 5, LocalDate.of(2024, 10, 19));
        Activities a2 = new Activities(02, "Quiz", 4.3, LocalDate.of(2024, 10, 20));
        Activities a3 = new Activities(03, "Examen", 4.8, LocalDate.of(2024, 10, 21));
        activitiesStudent.add(a1);
        activitiesStudent.add(a2);
        activitiesStudent.add(a3);
        activitiesgradingPeriod.add(a1);
        activitiesgradingPeriod.add(a2);
        activitiesgradingPeriod.add(a3);

        // Estudiantes
        Student est1 = new Student("Jorge", "Jimenez", 1002, 01);
        Student est2 = new Student("Alex", "Corrales", 1003, 02);
        Student est3 = new Student("Yul", "Fuentes", 1004, 04);
        studentsCourse.add(est1);
        studentsCourse.add(est2);
        studentsCourse.add(est3);

        // Profesores
        Teacher t1 = new Teacher("Juan", "Linares", 123, 01);


        // Cortes/Periodos
        GradingPeriod gp1 = new GradingPeriod(01, 01, 0);
        gradingPeriodSubject.add(gp1);


        // Materias
        Subject m1 = new Subject(01, "Biologia");
        Subject m2 = new Subject(02, "Matematicas");
        subjectsTeacher.add(m1);
        subjectsCurriculum.add(m1);
        subjectsCurriculum.add(m2);

        // Cursos
        Course c1 = new Course(01, "Octavo");
        

        //Pensum
        Curriculum p1 = new Curriculum(01, "abc123");

        //Asistencias 
        Attendance at1 = new Attendance(01, LocalDate.of(2024, 10, 19), 'V');
        Attendance at2 = new Attendance(02, LocalDate.of(2024, 10, 20), 'V');
        Attendance at3 = new Attendance(03, LocalDate.of(2024, 10, 21), 'V');
        attendancesStudent.add(at1);
        attendancesStudent.add(at2);
        attendancesStudent.add(at3);


        //Agregar Todo los objetos que le faltan a las clases
        t1.setSubjects(subjectsTeacher);
        gp1.setActivities(activitiesgradingPeriod);
        c1.setCurriculums(p1);
        c1.setStudent(studentsCourse);
        est1.setAttendances(attendancesStudent);
        est1.setActivities(activitiesgradingPeriod);
        p1.setSubjects(subjectsCurriculum);
        m1.setGradingPeriod(gradingPeriodSubject);
        

        object.treeStudent = object.addNode(object.treeStudent, est1);
        object.treeTeacher = object.addNode(object.treeTeacher, t1);
        object.print(object.treeStudent);
        System.out.println("");
        object.print(object.treeTeacher);
    }
}
