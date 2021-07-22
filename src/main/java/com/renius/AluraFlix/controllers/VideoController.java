package com.renius.AluraFlix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renius.AluraFlix.model.Video;
import com.renius.AluraFlix.services.VideoServices;

@RestController
@RequestMapping(value = "/")
public class VideoController {
	@Autowired
	private VideoServices service;
	
	@GetMapping(value = "/videos")
	public ResponseEntity<?> getAllVideos(){
		List<Video> videosList = service.findAllVideos();
		return ResponseEntity.ok().body(videosList);
	}
	
	@GetMapping(value = "video/{id}")
	public ResponseEntity<?> getVideosById(@PathVariable Integer id) {
		Video video = service.findVideoById(id);
		return ResponseEntity.ok().body(video);
	}
	
}
