package com.otc.jenkins.demo.endpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class HiAPI {
	@GetMapping("/hi")
	public String hello() {
		return "HI..";
	}
}
