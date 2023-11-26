package com.dictionary.moore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dictionary.moore.entity.Words;

@Repository
public interface WordsRepository extends JpaRepository<Words, String> {
}