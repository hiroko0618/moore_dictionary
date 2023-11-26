package com.dictionary.moore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "words")
public class Words {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="word")
	private String word;
	
	@Column(name="mean")
	private String mean;
	
	@Column(name="mean2")
	private String mean2;
	
	@Column(name="mean3")
	private String mean3;
	
	@Column(name="sub_category")
	private String sub;
	
	@Column(name="category")
	private String category;
}