package com.renius.AluraFlix.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.renius.AluraFlix.model.Video;

@RestController
@RequestMapping(value = "/teste")
public class TesteController {
	@GetMapping
	@ResponseBody
	public Video testar() {
		Video video = new Video(3,"nome","desc","www.teste.com");
		return video;
	}
}
