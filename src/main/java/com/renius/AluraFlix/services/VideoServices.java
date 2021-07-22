package com.renius.AluraFlix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renius.AluraFlix.model.Video;
import com.renius.AluraFlix.repositories.VideoRepository;

@Service
public class VideoServices {
	@Autowired
	public VideoRepository repository;
	
	public Video findVideoById(Integer id) {
		Optional<Video> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
