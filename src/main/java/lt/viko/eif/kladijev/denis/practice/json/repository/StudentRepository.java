package lt.viko.eif.kladijev.denis.practice.json.repository;

import lt.viko.eif.kladijev.denis.practice.json.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
    Optional<Student> findByName(String name);
}
