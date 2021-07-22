package com.renius.AluraFlix.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.renius.AluraFlix.model.Video;
import com.renius.AluraFlix.services.VideoServices;

@RestController
@RequestMapping(value = "/")
public class VideoController {
	@Autowired
	private VideoServices services;
	
	@GetMapping("videos")
	public ResponseEntity<?> getAllVideos(){
		List<Video> videosList = services.find();
		return ResponseEntity.ok().body(videosList);
	}
	
	@GetMapping("video/{id}")
	public ResponseEntity<Video> getVideosById(@PathVariable Integer id) {
		Video video = services.findOne(id);
		return ResponseEntity.ok().body(video);
	}
	@PostMapping("video/insert")
	public ResponseEntity<Void> insert(@RequestBody Video video){
		video = services.insert(video);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(video.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("video/{id}")
	public ResponseEntity<Void> update(@RequestBody Video video, @PathVariable Integer id){
		video.setId(id);
		video = services.update(video);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("video/{id}")
	public ResponseEntity<Video> delete(@PathVariable Integer id) {
		services.delete(id);
		return ResponseEntity.noContent().build();
	}
}
