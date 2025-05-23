package lt.viko.eif.kladijev.denis.practice.json.controller;

import lt.viko.eif.kladijev.denis.practice.json.model.Student;
import lt.viko.eif.kladijev.denis.practice.json.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController
{
    @Autowired private StudentService studentService;

    @GetMapping("/{name}")
    public Student getStudentByName(@PathVariable String name)
    {
        return studentService.getStudentByName(name);
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }
}
