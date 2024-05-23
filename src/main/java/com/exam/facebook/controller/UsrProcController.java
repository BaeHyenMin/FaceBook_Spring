package com.exam.facebook.controller;

import com.exam.facebook.domain.Usr;
import com.exam.facebook.dto.request.AddUsrRequest;
import com.exam.facebook.service.UsrService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsrProcController {

	private final UsrService usrService;

	@PostMapping("/signIn")
	public ResponseEntity<String> signIn(@RequestBody AddUsrRequest addUsrRequest){
		try {
			usrService.usrSave(addUsrRequest);
			return new ResponseEntity<>("성공",null,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>("실패",null,HttpStatus.BAD_REQUEST);
		}
	}


	@GetMapping("/usrView")
	public ResponseEntity<List<Usr>> usrView(){
		try {

			return new ResponseEntity<>(usrService.usrViewTest(),null,HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(null,null,HttpStatus.BAD_REQUEST);
		}
	}



}
