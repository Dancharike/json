package lt.viko.eif.kladijev.denis.practice.json.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student extends BaseEntity
{
    private String name;
    private int age;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("student-subject")
    private List<Subject> subjects;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("student-grade")
    private List<Grade> grades;

    public Student(String name, int age, List<Subject> subjects, List<Grade> grades)
    {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
        this.grades = grades;
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
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
