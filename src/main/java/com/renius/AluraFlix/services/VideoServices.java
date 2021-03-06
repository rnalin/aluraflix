package com.renius.AluraFlix.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renius.AluraFlix.model.Video;
import com.renius.AluraFlix.repositories.VideoRepository;

@Service
public class VideoServices {
	@Autowired
	public VideoRepository repository;
	
	public Video findOne(Integer id) {
		Optional<Video> video = repository.findById(id);
		
		return video.orElse(null);
	}
	
	public List<Video> find() {
		Optional<List<Video>> videosList = Optional.of(repository.findAll());
		return videosList.orElse(null);
	}

	public Video insert(Video video) {
		video.setId(null);
		return repository.save(video);
	}

	public Video update(Video video) {
		return repository.save(video);
	}

	public void delete(Integer id) {
		try {
			repository.deleteById(id);
		} catch (Exception badException) {
		}
		
	}
}
