package com.example.studentjpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.studentjpa.enti.Gardian;
import com.example.studentjpa.enti.Student;

@SpringBootTest
public class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentrepository;

	@Test
	public void saveStudent() {
		Student student = Student.builder()

				.emailId("rama.biji@gmail.com").firstname("rama").lastname("biji")//.gurdianName("Rama")
				//.gurdianEmail("rama@gmail.com").gurdianMobile("44444")
				.build();

		studentrepository.save(student);

	}
	@Test
	public void saveStudentWithGurdian() {
		
		Gardian gurdian=Gardian.builder()
				.email("rama@gmail.com")
				.name("Rama")
				.mobile("4444")
				.build();
		Student student=Student.builder()
				.firstname("Shivam")
				.emailId("shviam@gmail.com")
				.lastname("bijivemula")
				.gardian(gurdian)
				.build();
		studentrepository.save(student);
				
	}
	@Test
	public void printAllStudents() {
		
		List<Student>StudentList=
				studentrepository.findAll();
		StudentList.stream().forEach(n-> System.out.println(n.getFirstname()));
		System.out.println("StudentList="+StudentList);
		
	}
	
	@Test
	public void printstudentbyfirstnameContaining() {
		List<Student>students=studentrepository.findByfirstnameContaining("ra");
		System.out.println("Students="+students);
	}
	//@Test
	//public void printstudentBasedongardianname() {
}