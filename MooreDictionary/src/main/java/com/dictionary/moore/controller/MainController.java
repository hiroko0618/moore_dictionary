package com.dictionary.moore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dictionary.moore.entity.Words;
import com.dictionary.moore.service.WordsService;

@Controller
@RequestMapping("dictionary/moore/body")
public class MainController {
	
	@Autowired
	private WordsService wordsService;
	
	@GetMapping
	public String getWordsbody (Model model) {
		
		List<Words> allWords = new ArrayList<>();
		allWords = wordsService.getAll();
		
		model.addAttribute("allWords", allWords);
		
		return "/dictionary/moore/body";
	}
}