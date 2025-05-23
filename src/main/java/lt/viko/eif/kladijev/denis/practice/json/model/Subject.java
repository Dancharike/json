package lt.viko.eif.kladijev.denis.practice.json.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Subject extends BaseEntity
{
    private String title;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference("student-subject")
    private Student student;


    public Subject(String title, Student student)
    {
        this.title = title;
        this.student = student;
    }

    public Subject() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", studentId=" + (student != null ? student.getId() : null) +
        '}';
    }
}
