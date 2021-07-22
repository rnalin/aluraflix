package com.renius.AluraFlix.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renius.AluraFlix.domain.Video;

@RestController
@RequestMapping(value = "/videos")
public class VideoResource {
	@RequestMapping(method = RequestMethod.GET)
	public List<Video> listarVideos() {
		Video video1 = new Video(1, "video 1", "desc 1", "endereco 1");
		Video video2 = new Video(2, "video 2", "desc 2", "endereco 2");
		
		List<Video> lista = new ArrayList<>();
		
		lista.add(video1);
		lista.add(video2);
		
		return lista;
	}
}
