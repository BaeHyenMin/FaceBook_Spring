package com.exam.facebook.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exam.facebook.dto.FileResponse;
import com.exam.facebook.service.FileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BoardView {

	private final FileService fileService;
	
	@GetMapping("/uploads/{name}")
	public ResponseEntity<byte[]> getFile(@PathVariable("name") String fileName) {
		FileResponse res = fileService.getFile(fileName);
		if (res.getContentType() != null) {
			HttpHeaders header = new HttpHeaders();
			header.add("Content-Type", res.getContentType());
			return new ResponseEntity<>(res.getBytes(), header, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
