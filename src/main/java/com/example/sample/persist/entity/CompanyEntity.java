package com.example.sample.persist.entity;

import com.example.sample.model.Company;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "COMPANY")
@ToString
@NoArgsConstructor
@Getter
public class CompanyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(unique = true)
	private String ticker;
	private String name;

	public CompanyEntity(Company company) {
		this.ticker = company.getTicker();
		this.name = company.getName();
	}
}
