package com.dictionary.moore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.dictionary.moore.entity.Category;
import com.dictionary.moore.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
}