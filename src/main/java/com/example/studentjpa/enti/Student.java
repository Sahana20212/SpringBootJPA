package com.example.studentjpa.enti;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="student")
public class Student {
	@Id
	 @SequenceGenerator(
	            name = "student_sequence",
	            sequenceName = "student_sequence",
	            allocationSize = 1
	    )
	    @GeneratedValue(
	            strategy = GenerationType.SEQUENCE,
	            generator = "student_sequence"
	    )
	@Column(name="studentid")
	
	private long studentId;
	@Column(name="studentfirstname")
	private String firstname;
	@Column(name="studentlastname")
	private String lastname;
	@Column(name="studentemailid")
	private String emailId;
	
	
	@Embedded
	private Gardian gardian;

}
