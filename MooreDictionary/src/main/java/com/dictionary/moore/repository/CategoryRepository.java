package com.dictionary.moore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dictionary.moore.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
}