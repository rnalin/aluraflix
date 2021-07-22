package com.renius.AluraFlix.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/videos")
public class VideoResource {
	@GetMapping
	public String listarVideos() {
		return "REST ok.";
	}
}
