package com.dictionary.moore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.dictionary.moore.entity.Words;
import com.dictionary.moore.repository.WordsRepository;

@Service
public class WordsService {
	
	@Autowired
	private WordsRepository wordsRepository;
	
	@GetMapping
	public List<Words> getAll() {
		return wordsRepository.findAll();
	}
}