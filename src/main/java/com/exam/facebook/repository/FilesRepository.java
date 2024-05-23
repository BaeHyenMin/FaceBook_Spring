package com.exam.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.facebook.domain.Files;

public interface FilesRepository extends JpaRepository<Files, String>{

}
