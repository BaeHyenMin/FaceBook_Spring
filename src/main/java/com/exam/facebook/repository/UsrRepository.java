package com.exam.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.facebook.domain.Usr;

public interface UsrRepository extends JpaRepository<Usr, String>{

}
