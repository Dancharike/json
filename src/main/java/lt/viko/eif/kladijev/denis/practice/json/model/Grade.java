package lt.viko.eif.kladijev.denis.practice.json.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Grade extends BaseEntity
{
    @ManyToOne
    @JoinColumn(name = "subject_id") // foreign key
    private Subject subject;
    private double score;
    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference("student-grade")
    private Student student;

    public Grade(Subject subject, double score, Student student)
    {
        this.subject = subject;
        this.score = score;
        this.student = student;
    }

    public Grade() {}

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subjectId=" + (subject != null ? subject.getId() : null) +
                ", score=" + score +
                ", studentId=" + (student != null ? student.getId() : null) +
                '}';
    }
}
