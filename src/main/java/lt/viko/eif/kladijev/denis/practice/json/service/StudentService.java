package lt.viko.eif.kladijev.denis.practice.json.service;

import lt.viko.eif.kladijev.denis.practice.json.model.Student;
import lt.viko.eif.kladijev.denis.practice.json.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService implements IStudentService
{
    @Autowired private StudentRepository database;

    @Override
    public Student saveStudent(Student student)
    {
        return database.save(student);
    }

    @Override
    public Student getStudentByName(String name)
    {
        return database.findByName(name).orElse(null);
    }

    @Override
    public List<Student> getAllStudents()
    {
        return database.findAll();
    }
}
