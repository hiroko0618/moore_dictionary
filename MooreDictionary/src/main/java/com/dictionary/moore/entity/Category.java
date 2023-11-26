package com.dictionary.moore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@Column(name = "category_id")
	private Integer category_id;
	
	@Column(name = "category_name")
	private String category_name;
}