package lt.viko.eif.kladijev.denis.practice.json.service;

import lt.viko.eif.kladijev.denis.practice.json.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService
{
    private final Map<String, Student> database = new HashMap<>();

    public Student saveStudent(Student student)
    {
        database.put(student.getName(), student);

        return student;
    }

    public Student getStudentByName(String name)
    {
        return database.getOrDefault(name, null);
    }

    public List<Student> getAllStudents()
    {
        return new ArrayList<>(database.values());
    }
}
