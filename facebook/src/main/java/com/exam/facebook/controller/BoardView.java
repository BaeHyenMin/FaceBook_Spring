package com.exam.facebook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardView {
	
	
	@GetMapping("/img/{name}")
	public Byte[] imgView(@PathVariable("name") String img) {
		return null;
	}
}
