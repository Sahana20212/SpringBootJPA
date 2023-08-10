package com.example.studentjpa.enti;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
		

	@AttributeOverrides({
		@AttributeOverride(
				name="name",
				column=@Column(name="gurdianname")
				),
		
			@AttributeOverride(
					name="email",
					column=@Column(name="gurdianemail")
					),
			@AttributeOverride(
					name="mobile",
					column=@Column(name="gurdianmobile")
					),
})
public class Gardian {
	
	
	//@Column(name="gurdianname")
	private String name;
	//@Column(name="gurdianemail")
	private String email;
	//@Column(name="gurdianmobile")
	private String mobile;
	

}
