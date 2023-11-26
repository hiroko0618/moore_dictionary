package com.dictionary.moore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dictionary.moore.entity.Category;
import com.dictionary.moore.service.CategoryService;

@Controller
@RequestMapping("dictionary/moore/menu")
public class MenuController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public String getMenu (Model model) {
		
		List<Category> menuList = new ArrayList<>();
		menuList = categoryService.getAll();
		
		model.addAttribute("menuList", menuList);
		
		return "dictionary/common/menu";
	}
}