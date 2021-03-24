package com.cognizant.learntodayrestapi.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.learntodayrestapi.model.Trainer;
import com.cognizant.learntodayrestapi.service.TrainerService;

@RestController
@RequestMapping("/api/Trainer")
public class TrainerController {

	@Autowired
	private TrainerService trainerService;

	@PostMapping
	public ResponseEntity<Object> trainerSignUp(@RequestBody Trainer trainer) {

		boolean isTrainerAddedToDB = trainerService.trainerSignUp(trainer);

		if (isTrainerAddedToDB) {
			return new ResponseEntity(trainer, HttpStatus.CREATED);
		}

		return new ResponseEntity("Something went wrong", HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> updatePasssword(@PathVariable int id, @RequestBody Trainer trainer) {
		return null;
	}

}
