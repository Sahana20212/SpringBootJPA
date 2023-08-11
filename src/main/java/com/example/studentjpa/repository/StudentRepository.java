package com.example.studentjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.studentjpa.enti.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

public List <Student> findByfirstname(String firstname);

public List <Student> findByfirstnameContaining(String name );

public List <Student> findBylastnameContaining(String name );

public List <Student> findBygardianName(String gardianname);

Student findByfirstnameAndlastname(String firstname, String lastname);
/*
//This is the JPQL Query Based on Class attribute I created ,Not based on the table created in the database.
@Query("select s from student s where s.emilId=?1")
Student getStudentByEmailAdress(String EmailId);

*/
}
