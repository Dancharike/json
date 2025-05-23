package lt.viko.eif.kladijev.denis.practice.json.service;

import lt.viko.eif.kladijev.denis.practice.json.model.Student;

import java.util.List;

public interface IStudentService
{
    Student saveStudent(Student student);
    Student getStudentByName(String name);
    List<Student> getAllStudents();
}
