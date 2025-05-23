package lt.viko.eif.kladijev.denis.practice.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lt.viko.eif.kladijev.denis.practice.json.model.Grade;
import lt.viko.eif.kladijev.denis.practice.json.model.Student;
import lt.viko.eif.kladijev.denis.practice.json.model.Subject;
import lt.viko.eif.kladijev.denis.practice.json.repository.StudentRepository;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@SpringBootApplication
public class JsonApplication
{
	public static void main(String[] args) throws Exception
	{
		ConfigurableApplicationContext context = SpringApplication.run(JsonApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student student = new Student();
		student.setName("Denis");
		student.setAge(20);

		Subject math = new Subject("Math", student);
		Subject it = new Subject("IT", student);

		Grade g1 = new Grade(math, 9.0, student);
		Grade g2 = new Grade(it, 9.5, student);

		student.setSubjects(List.of(math, it));
		student.setGrades(List.of(g1, g2));

		student = studentRepository.save(student);

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		String jsonOutput = mapper.writeValueAsString(student);
		System.out.println(jsonOutput);

//		try (
//				InputStream schemaStream = JsonApplication.class.getResourceAsStream("/student-schema.json");
//				InputStream jsonStream = new ByteArrayInputStream(jsonOutput.getBytes(StandardCharsets.UTF_8))
//		) {
//			JSONObject rawSchema = new JSONObject(new JSONTokener(schemaStream));
//			Schema schema = SchemaLoader.load(rawSchema);
//
//			schema.validate(new JSONObject(new JSONTokener(jsonStream)));
//
//			System.out.println("JSON is valid according to schema.");
//		}
//		catch (Exception e)
//		{
//			System.out.println("Validation failed: " + e.getMessage());
//		}
	}
}
