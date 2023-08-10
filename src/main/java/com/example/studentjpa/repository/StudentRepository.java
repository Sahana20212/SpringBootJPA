package com.example.studentjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentjpa.enti.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

public List <Student> findByfirstname(String firstname);

public List <Student> findByfirstnameContaining(String name );

public List <Student> findBylastnameContainingNotNull(String name );

public List <Student> findBygardianName(String gardianname);


}
