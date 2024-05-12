package com.exam.facebook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.facebook.dto.request.AddUsrRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UsrProcController {
	
	@GetMapping(name = "/signIn")
	public ResponseEntity<?> signIn(AddUsrRequest addUsrRequest){
		try {
			return new ResponseEntity<>(null,null,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null,null,HttpStatus.BAD_REQUEST);
		}
	}
}
