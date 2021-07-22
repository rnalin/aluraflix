package com.renius.AluraFlix.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renius.AluraFlix.domain.Video;

@RestController
@RequestMapping(value = "/videos")
public class VideoResource {
	@GetMapping
	public List<Video> listarVideos() {
		Video video1 = new Video(1, "v1", "d1", "1");
		Video video2 = new Video(2, "v2", "d2", "2");
		
		List<Video> listaVideos = new ArrayList<>();
		
		listaVideos.add(video1);
		listaVideos.add(video2);
		
		return listaVideos;
	}
}
