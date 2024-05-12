package com.exam.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.facebook.domain.Board;

public interface BoardRepository extends JpaRepository<Board, String>{

}
