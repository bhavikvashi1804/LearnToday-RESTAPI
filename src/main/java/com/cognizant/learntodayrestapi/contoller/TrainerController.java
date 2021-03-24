package com.cognizant.learntodayrestapi.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.learntodayrestapi.model.Trainer;

@RestController
@RequestMapping("/api/Trainer")
public class TrainerController {

	@PostMapping
	public ResponseEntity<Object> trainerSignUp(@RequestBody Trainer trainer) {
		return null;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updatePasssword(@PathVariable int id,@RequestBody Trainer trainer){
		return null;
	}

}
