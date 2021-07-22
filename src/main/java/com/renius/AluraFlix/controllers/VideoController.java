package com.renius.AluraFlix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renius.AluraFlix.model.Video;
import com.renius.AluraFlix.services.VideoServices;

@RestController
@RequestMapping(value = "/video")
public class VideoController {
	@Autowired
	private VideoServices service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarVideoPorId(@PathVariable Integer id) {
		Video obj = service.findVideoById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
