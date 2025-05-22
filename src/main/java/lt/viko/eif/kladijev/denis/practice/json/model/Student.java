package lt.viko.eif.kladijev.denis.practice.json.model;

import java.util.List;

public class Student
{
    private String name;
    private int age;
    private List<Subject> subjects;
    private List<Grade> grades;

    public Student(String name, int age, List<Subject> subjects, List<Grade> grades)
    {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.grades = grades;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                ", grades=" + grades +
                '}';
    }
}
