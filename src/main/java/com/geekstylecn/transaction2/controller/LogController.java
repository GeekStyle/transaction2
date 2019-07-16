package com.geekstylecn.transaction2.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekstylecn.transaction2.model.Log;
import com.geekstylecn.transaction2.service.LogService;

@RestController
@RequestMapping("/log")
public class LogController {
	
	@Autowired
	LogService logService;
	
	
	@PostMapping
	public ResponseEntity<?> insertLog(@RequestBody Log log) {
		//insert log
		log.setCreateTime(new Date());
		logService.insertLog(log);
		return ResponseEntity.status(HttpStatus.OK).body(log.getId());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteLog(@PathVariable Long id) {
		logService.deleteLog(id);
		return ResponseEntity.status(HttpStatus.OK).body(id);
	}
	
}
